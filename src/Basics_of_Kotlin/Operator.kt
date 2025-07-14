package Basics_of_Kotlin

fun main() {
    // --------- Arithmetic operations ---------
    val a = 10
    val b = 3

    println("Addition: ${a + b}")        // 10 + 3 = 13
    println("Subtraction: ${a - b}")     // 10 - 3 = 7
    println("Multiplication: ${a * b}")  // 10 * 3 = 30
    println("Division: ${a / b}")        // 10 / 3 = 3
    println("Modulus: ${a % b}")         // 10 % 3 = 1

    // --------- Comparison operations ---------
    println("Equal: ${a == b}")          // false
    println("Not equal: ${a != b}")      // true
    println("Greater than: ${a > b}")    // true
    println("Less than: ${a < b}")       // false
    println("Greater or equal: ${a >= b}") // true
    println("Less or equal: ${a <= b}")    // false

    // --------- Logical operations ---------
    val x = true
    val y = false

    println("AND: ${x && y}")            // false
    println("OR: ${x || y}")             // true
    println("NOT x: ${!x}")              // false

    // --------- Assignment operations ---------
    var num = 5
    println("Original num: $num")
    num += 2   // num = num + 2
    println("After += : $num")
    num -= 1   // num = num - 1
    println("After -= : $num")
    num *= 3   // num = num * 3
    println("After *= : $num")
    num /= 2   // num = num / 2
    println("After /= : $num")
}
