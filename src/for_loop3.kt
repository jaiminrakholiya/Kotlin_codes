fun main() {
    println("Squares of numbers from 1 to 5:")
    for (i in 1..5) { // Loop from 1 to 5
        val square = i * i // Calculate the square of the current number
        println("The square of $i is $square")
    }
}