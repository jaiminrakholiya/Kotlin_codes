package oops
// Abstract class Shape - you cannot create an object of this class directly
abstract class Shape {
    // Abstract function area() - must be implemented by subclasses
    abstract fun area(): Double
}

// Circle class inherits from Shape and implements the area() function
class Circle(val radius: Double) : Shape() {
    override fun area(): Double {
        // Area formula for circle = π * r * r
        return 3.14 * radius * radius
    }
}

// Rectangle class inherits from Shape and implements the area() function
class Rectangle(val length: Double, val width: Double) : Shape() {
    override fun area(): Double {
        // Area formula for rectangle = length * width
        return length * width
    }
}

// Main function - entry point of the program
fun main() {
    val circle = Circle(radius = 5.0) // Creating Circle object with radius 5
    val rectangle = Rectangle(length = 4.0, width = 6.0) // Rectangle with 4x6

    // Calling area() method on Circle object
    println("Circle ka area: ${circle.area()}") // Output: Circle ka area: 78.5

    // Calling area() method on Rectangle object
    println("Rectangle ka area: ${rectangle.area()}") // Output: Rectangle ka area: 24.0
}

