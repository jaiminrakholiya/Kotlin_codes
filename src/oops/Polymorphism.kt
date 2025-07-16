package oops

// 'open' means this class can be inherited
open class Animal {
    // 'open' means this function can be overridden by child classes
    open fun makeSound() {
        println("Koi awaaz") // Default sound for any generic animal
    }
}

// Dog class inherits from Animal
class Dog : Animal() {
    // 'override' means we're changing the behavior of the makeSound() function
    override fun makeSound() {
        println("Woof woof!") // Specific sound for Dog
    }
}

// Cat class also inherits from Animal
class Cat : Animal() {
    // Overriding makeSound() for Cat
    override fun makeSound() {
        println("Meow meow") // Specific sound for Cat
    }
}

// This is the starting point of the program
fun main() {
    val dog = Dog() // Creating a Dog object
    val cat = Cat() // Creating a Cat object

    dog.makeSound() // Calls Dog's version -> Output: Woof woof!
    cat.makeSound() // Calls Cat's version -> Output: Meow meow
}
