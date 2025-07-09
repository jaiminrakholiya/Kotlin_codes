import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val correctPassword = "kotlin123"
    var enteredPassword: String

    while (true) { // Loop indefinitely until broken
        print("Please enter the password: ")
        enteredPassword = scanner.nextLine()

        if (enteredPassword == correctPassword) {
            println("Password accepted! Welcome.")
            break // Exit the loop
        } else {
            println("Incorrect password. Please try again.")
        }
    }
    scanner.close()
}