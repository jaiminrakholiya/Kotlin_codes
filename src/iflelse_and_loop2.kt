import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter a number to check if it's prime: ")
    val number = scanner.nextInt()

    if (number <= 1) {
        println("$number is not a prime number.")
        return // Exit the program if the number is 0 or 1
    }

    var isPrime = true


    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) { // If number is divisible by i
            isPrime = false // It's not prime
            break // No need to check further, break out of the loop
        }
    }

    if (isPrime) {
        println("$number is a prime number.")
    } else {
        println("$number is not a prime number.")
    }

    scanner.close()
}