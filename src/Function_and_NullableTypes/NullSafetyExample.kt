package Function_and_NullableTypes

fun main() {
    // ✅ Non-nullable variable: cannot be assigned null
    val name: String = "Jaimin"
    println("Non-nullable variable: $name")

    // ❌ This will cause an error because `name` is non-nullable
    // name = null

    // ✅ Nullable variable: can hold null values
    val nickname: String? = null
    println("Nullable variable: $nickname")

    // ✅ Safe call operator (?.): only access length if nickname is NOT null
    // Returns null safely without crashing
    println("Length of nickname (safe call): ${nickname?.length}")

    // ✅ Elvis operator (?:): if nickname?.length is null, use 0 instead
    val length = nickname?.length ?: 0
    println("Length with Elvis operator: $length")

    // ✅ Not-null assertion (!!): forcefully treat nullable variable as non-null
    // ⚠️ If nickname is null, this will throw a NullPointerException
    try {
        val forcedLength = nickname!!.length // This will crash because nickname is null
        println("Length with !! operator: $forcedLength")
    } catch (e: NullPointerException) {
        println("Error using !! on null: ${e.message}")
    }
}
