package equality_and_casting

/**
 * Equality (Structural vs Referential)
 * It demonstrates how Kotlin differentiates between object content (structural) and
 * object memory address (referential)
 *
 * `==` (Structural Equality): Compares values. Similar to `.equals()`.
 * `===` (Referential Equality): Compares memory address. Checks if pointers target the same instance.
 */

data class User(val id: Int, val name: String, val email: String)

fun main() {
    // Simulate a cached user already being shown on screen.
    val cachedUser = User(1, "Alok", "corporate.alok@gmail.com")

    // Simulate a fresh user object just parsed from a new API response
    val fetchedUser = User(1, "Alok", "corporate.alok@gmail.com")

    // == calls `equals()`, which for data class compares all properties
    val sameData = cachedUser == fetchedUser
    println("Same data: $sameData")

    // === checks if it's the same object in memory or a completely different instance
    val sameInstance = cachedUser === fetchedUser
    println("Same instance: $sameInstance")
}