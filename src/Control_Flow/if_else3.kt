package Control_Flow//3. Compare two numbers and print which is bigger.

fun main() {
    val number1 = 25
    val number2 = 40

    if (number1 > number2) {
        println("$number1 is bigger than $number2")
    } else if (number2 > number1) {
        println("$number2 is bigger than $number1")
    } else {
        println("Both numbers are equal: $number1 and $number2")
    }
}