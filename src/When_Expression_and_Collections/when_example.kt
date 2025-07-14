package When_Expression_and_Collections

fun main() {
    val day = 3

    val dayName = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println("Day $day is $dayName")
}
