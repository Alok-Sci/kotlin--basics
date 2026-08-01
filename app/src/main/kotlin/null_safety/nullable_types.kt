package null_safety

/**
 * Null Safety (types)
 * It enforces the developer to explicitly declare beforehand which variables
 * are allowed to hold `null` values.
 * By doing this, the compiler catches potential `null pointer errors` at compile-time,
 * rather than letting them crash the application at runtime
 *
 * Based on Null Safety, Kotlin splits types into two categories:
 * Nullable: Variables which can hold null value
 * Non-Nullable: Variables which can't hold null value
 *
 * Nullable variables are when defined then a `?` suffix is added to the `type definition`
 */

fun main() {
    val profession: String?
    profession = null
    println(profession)

    val salary: Int? = null
    println(salary)
}