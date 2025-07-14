//======================= 1. Hard-Coded Version =======================

class CarHardCoded { // Blue Print

    var color = "Red"
    var speed = 100

    fun drive() {
        println("Car is driving at $speed kmph with color $color")
    }

    fun stop() {
        println("Car is stopped")
    }
}

fun main1() {
    println("------ Hard Coded Example ------")
    val car = CarHardCoded()  // 🔹 Object of CarHardCoded class is created here
    car.drive()
    car.stop()
}

//======================= 2. Primary Constructor Version =======================

class CarPrimary(var speed: Int, var color: String) { // Blue Print

    fun drive() {
        println("Car is driving at $speed kmph with color $color")
    }

    fun stop() {
        println("Car is stopped")
    }
}

fun main2() {
    println("------ Primary Constructor Example ------")
    val car = CarPrimary(120, "Blue")  // 🔹 Object of CarPrimary class is created here using primary constructor
    car.drive()
    car.stop()
}

//======================= 3. Secondary Constructor Version =======================

class CarSecondary() { // Blue Print

    var speed = 0
    var color = ""

    constructor(speed: Int, color: String) : this() {
        this.speed = speed
        this.color = color
        println("Car initialized with speed: $speed kmph and color: $color")
    }

    fun drive() {
        println("Car is driving at $speed kmph with color $color")
    }

    fun stop() {
        println("Car is stopped")
    }
}

fun main3() {
    println("------ Secondary Constructor Example ------")
    val car = CarSecondary(150, "Black")  // 🔹 Object of CarSecondary class is created here using secondary constructor
    car.drive()
    car.stop()
}

fun main() {
    main1() // Calls the function where CarHardCoded object is created
    main2() // Calls the function where CarPrimary object is created
    main3() // Calls the function where CarSecondary object is created
}
