package Loops//2. Calculate the sum of numbers from 1 to 10.

fun main() {
    var sum = 0

    for (i in 1..10) {
        sum = sum + i
    }

    println("The sum of numbers from 1 to 10 is: $sum")
}