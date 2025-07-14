import java.util.* // Import for the Scanner class

// Main function - entry point of the program
fun main(args: Array<String>) {
    println()
    println()
    runStudentApp() // Calls the oops.Basics_of_Kotlin.Basics_of_Kotlin.Basics_of_Kotlin.Basics_of_Kotlin.Basics_of_Kotlin.Control_Flow.Control_Flow.Control_Flow.Control_Flow.Control_Flow.Control_Flow.Control_Flow.Loops.oops.main student application logic
    println()
    println("Printing inline function (squareNumber) in Q 10: ${squareNumber(22)}")
    print("Printing Lambda function (doubleNumber) on Q11 : ")
    doubleNumber(10) // Calls the lambda function

    println()
}

// 1. Basic function to collect student's name, roll number, and marks.
fun runStudentApp() {
    val scanner = Scanner(System.`in`)

    print("Enter Student's Name : ")
    val name = scanner.nextLine()
    println()

    print("Enter Student Nickname (optional, press Enter to skip) : ")
    val nickname: String? = readLine() // Using readLine() for nullable string input

    println()
    print("Enter Roll Number of Student : ")
    val roll = scanner.nextInt()
    println()

    print("Enter Marks for Science (out of 100) : ")
    val scienceMarks = scanner.nextInt()
    if (!isValidMark(scienceMarks)) { // Q 14: Local function for validation
        println("Invalid entry. Marks must be between 0 and 100.")
        return // Exit the function if marks are invalid
    }

    print("Enter Marks for Maths (out of 100) : ")
    val mathMarks = scanner.nextInt()
    if (!isValidMark(mathMarks)) {
        println("Invalid entry. Marks must be between 0 and 100.")
        return // Exit the function if marks are invalid
    }

    print("Enter Marks for English (out of 100) : ")
    val englishMarks = scanner.nextInt()
    if (!isValidMark(englishMarks)) {
        println("Invalid entry. Marks must be between 0 and 100.")
        return // Exit the function if marks are invalid
    }
    println()
    println()
    println(".. Student Utility App ..")
    println()
    // Used both Q 13 (extension function) and Q 15 (anonymous function)
    println(generateGreetingMessage(name.toStudentUpperCase()))
    println()

    // 3. Calculate total marks (with default arguments from Q6 implicitly used if marks aren't entered)
    val totalMarks = calculateTotalMarks(mathMarks, scienceMarks, englishMarks)
    // 4. Calculate percentage
    val averagePercentage: Double = calculatePercentage(totalMarks)

    // 8. Print average using vararg function
    println("Percentage of Student (calculated with averageMarks): ${averageMarks(scienceMarks, mathMarks, englishMarks)}")

    // 2. Determine student's grade using a when statement based on average percentage.
    val grade = when (averagePercentage.toInt()) { // Convert to Int for range check
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        else -> 'F' // Default grade for failing
    }

    println("Grade of Student is : $grade")
    println()

    // 5. Convert percentage to grade points using a single-expression function.
    println("Grade point of Student is : ${gradePoint(averagePercentage.toInt())}")
    println()

    // 12. Implement a higher-order function that takes a lambda to check pass/fail status.
    val passedExam = checkPassStatus(averagePercentage) { percentage -> percentage > 60.0 }
    if (passedExam) {
        println("You have passed the Exam!")
    } else {
        println("You have failed the Exam.")
    }

    println()
    // 9. Print a thank you message (Unit function) with null safety for nickname.
    printThankYouMessage(nickname)
}

// --- Function Definitions ---

// 3. Function to calculate total marks.
// 6. Uses default arguments (if not provided, marks default to 50).
fun calculateTotalMarks(math: Int = 50, science: Int = 50, english: Int = 50): Int {
    val total = math + science + english
    println("Total Marks of Student is : $total")
    return total
}

// 4. Function with a return type to calculate the percentage.
fun calculatePercentage(totalMarks: Int): Double {
    // Using 3.0 to ensure floating-point division
    return totalMarks / 3.0
}

// 5. Single-expression function to convert percentage to grade points.
fun gradePoint(percentage: Int): Int = when (percentage) {
    in 90..100 -> 10
    in 80..89 -> 9
    in 70..79 -> 8
    in 60..69 -> 7
    in 50..59 -> 6
    in 40..49 -> 5
    else -> 0
}

// 8. Function to accept multiple marks (vararg) and return their average.
fun averageMarks(vararg marks: Int): Double =
    if (marks.isNotEmpty()) marks.sum().toDouble() / marks.size else 0.0

// 9. Unit function that prints a welcome/thank you message (returns nothing explicitly).
fun printThankYouMessage(nick: String? = null): Unit { // nick is nullable, defaults to null
    // Uses the Elvis operator (?:) to provide a default value if nickname is null
    println("...... Thank ${nick ?: "you"}! for Visiting ....")
}

// 10. Small inline function to square a number.
inline fun squareNumber(a: Int) = a * a

// 11. Lambda function to double a given number.
val doubleNumber = { num: Int -> println(num * 2) }

// 12. Higher-order function that takes a lambda to check if the student passed.
fun checkPassStatus(percentage: Double, operation: (Double) -> Boolean): Boolean {
    return operation(percentage)
}

// 13. Extension function for the String class to make the student's name uppercase.
fun String.toStudentUpperCase(): String {
    return this.uppercase()
}

// 14. A local-style (top-level for reusability here) function to validate marks between 0 and 100.
fun isValidMark(mark: Int): Boolean {
    return mark in 0..100 // Concise way to check if mark is within the range
}

// 15. Anonymous function to greet the student with a random message.
val generateGreetingMessage = fun(name: String): String {
    val messages = arrayOf(
        "Hello $name!",
        "Welcome $name!",
        "Nice to see you, $name!",
        "Hey $name, let’s start learning!",
        "Hi $name! Ready to rock Kotlin?"
    )
    return messages.random() // Selects a random message from the array
}