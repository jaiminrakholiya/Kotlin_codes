package Loops

import java.util.Scanner
import kotlin.random.Random

fun main() {
    val scanner = Scanner(System.`in`)
    var rollAgain = "yes"

    while (rollAgain.equals("yes", ignoreCase = true)) {
        val diceRoll = Random.nextInt(1, 7) // Generates a random number between 1 (inclusive) and 7 (exclusive)
        println("You rolled a $diceRoll")

        print("Roll again? (yes/no): ")
        rollAgain = scanner.nextLine()
    }
    println("Thanks for playing!")
    scanner.close()
}