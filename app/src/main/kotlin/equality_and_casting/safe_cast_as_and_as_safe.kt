package equality_and_casting

/**
 * Type Casting (explicit cast - safe and unsafe)
 * In Kotlin, explicit type casting can be performed using `as` or `as?` operators.
 *
 * `as` (unsafe cast) operator
 *  - casts a value into another type.
 *  - and if the cast is not possible, then it throws a `ClassCastException` and crashes the app.
 *
 * `as?` (safe cast) operator
 *  - safely casts a value into another type,
 *  - and if cast is not possible then returns `null`, instead of crashing.
 */

fun main() {
    val settings: Map<String, Any> = mapOf(
        "username" to "alok_the_dev",
        "retryCount" to 3,
    )

    // Unsafe cast (`as`)
    val username = settings["username"] as String
    println(username.uppercase())

    val retryCountAsStringUnsafe = settings["retryCount"] as String
    println(retryCountAsStringUnsafe) // would crash the program with `ClassCastException`

    // Safe cast (`as?`)
    val theme = settings["theme"] as? String // null, "theme" key doesn't exist in "settings" map
    println("Theme: $theme")

    val retryCountAsString = settings["retryCount"] as? String // null, "retryCount" key has an Int value assigned
    println("Retry count as string: $retryCountAsString")
}