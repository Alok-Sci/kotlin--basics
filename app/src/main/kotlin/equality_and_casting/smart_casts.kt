package equality_and_casting

/**
 * Type Casting (smart cast)
 * Smart cast is one of a great Kotlin features that avoids a separate manual cast by using it with type checking.
 *
 * Rule: Kotlin can ONLY smart-cast a variable if it can guarantee that the value won't change between
 * the time it is checked and the time it is used.
 */

// A user-defined function that checks the type of the error, and based on that in a smartly casts
// the value to that type.
fun describeApiError(error: Any) {
    if (error is String) {
        // inside this block the `error` is of type `String`
        println("Error message: ${error.uppercase()}")
    } else if (error is Map<*, *>) {
        // here the `error` is of type `Map<*, *>`
        println("Structured error with ${error.size} fields")
    } else {
        // here the type of `error` depends on the value it stores.
        println("Unknown error format: $error")
    }
}

fun main() {
    describeApiError("Network timeout")
    describeApiError(mapOf("code" to 500, "message" to "Server error"))
    describeApiError(404)
}