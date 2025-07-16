package oops

// Define an interface called Shape with an abstract method area()
interface Shape {
    fun area(): Double  // All shapes must implement this method
}

// Circle class implementing Shape interface
class Circle(val radius: Double) : Shape {
    // Override the area method for Circle
    override fun area(): Double {
        // Area formula for circle: π * r²
        return 3.14 * radius * radius
    }
}

// Rectangle class implementing Shape interface
class Rectangle(val length: Double, val width: Double) : Shape {
    // Override the area method for Rectangle
    override fun area(): Double {
        // Area formula for rectangle: length * width
        return length * width
    }
}

fun main() {
    // Create a Circle object with radius 5.0
    val circle = Circle(radius = 5.0)

    // Create a Rectangle object with length 4.0 and width 6.0
    val rectangle = Rectangle(length = 4.0, width = 6.0)

    // Print the area of the circle
    println("Circle ka area: ${circle.area()}")  // Output: Circle ka area: 78.5

    // Print the area of the rectangle
    println("Rectangle ka area: ${rectangle.area()}")  // Output: Rectangle ka area: 24.0
}
