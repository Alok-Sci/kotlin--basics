package collections

/**
 * List (readonly)
 * In Kotlin, we can define an immutable list of items using `listOf()`
 */

fun main() {
    val names = listOf("Alok", "Suresh", "Surendra")
    // ❌ Compile-time error: It's an immutable list
    // names = listOf("Alok Singh", "Suresh Kumar Bind")
    println(names.joinToString("|", prefix = "[", postfix = "]"))
}