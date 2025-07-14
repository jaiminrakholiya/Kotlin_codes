package Function_and_NullableTypes

fun main() {
    val result = operate(a = 5, b = 5, operation = { x, y -> x + y })
    print(result)
}

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}
