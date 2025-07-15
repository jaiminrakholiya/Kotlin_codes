package Basics_of_Kotlin

fun main() {
    // Integer types
    val byteVal: Byte = 10           // Byte: 8-bit signed integer
    val shortVal: Short = 1000       // Short: 16-bit signed integer
    val intVal: Int = 2020           // Int: 32-bit signed integer
    val longVal: Long = 123456789L   // Long: 64-bit signed integer

    // Unsigned Integer types
    val uByteVal: UByte = 255u       // UByte: 8-bit unsigned integer
    val uShortVal: UShort = 65535u   // UShort: 16-bit unsigned integer
    val uIntVal: UInt = 100u         // UInt: 32-bit unsigned integer
    val uLongVal: ULong = 9999999uL  // ULong: 64-bit unsigned integer

    // Floating-point numbers
    val floatVal: Float = 24.5f      // Float: 32-bit floating point
    val doubleVal: Double = 19.99    // Double: 64-bit floating point

    // Boolean type
    val isEnabled: Boolean = true    // Boolean: true or false

    // Character type
    val separator: Char = ','        // Char: a single character

    // String type
    val message: String = "Hello, kotlin!"  // String: a sequence of characters

    // Printing all the values
    println("Byte: $byteVal")
    println("Short: $shortVal")
    println("Int: $intVal")
    println("Long: $longVal")

    println("UByte: $uByteVal")
    println("UShort: $uShortVal")
    println("UInt: $uIntVal")
    println("ULong: $uLongVal")

    println("Float: $floatVal")
    println("Double: $doubleVal")

    println("Boolean: $isEnabled")
    println("Char: $separator")
    println("String: $message")



    // Variable declared without initialization
    val d: Int
// Variable initialized
    d = 3

// Variable explicitly typed and initialized
    val e: String = "hello"

// Variables can be read because they have been initialized
    println(d) // 3
    println(e) // hello
}
