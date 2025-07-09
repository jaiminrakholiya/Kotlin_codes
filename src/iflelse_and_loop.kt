import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var biggestNumber = Int.MIN_VALUE // Initialize with the smallest possible integer value

    println("Please enter 5 numbers:")

    for (i in 1..5) { // Loop 5 times
        print("Enter number $i: ")
        val currentNumber = scanner.nextInt()

        if (currentNumber > biggestNumber) {
            biggestNumber = currentNumber // Update biggestNumber if currentNumber is larger
        }
    }

    println("The biggest number entered is: $biggestNumber")
    scanner.close()
}