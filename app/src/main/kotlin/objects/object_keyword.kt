package objects

/**
 * Object Declaration:
 * In Kotlin, we can define a `singleton` class by replacing the `class` keyword with `object`.
 * The object declaration can be nested inside a `class`.
 *
 * Singleton Pattern:
 * It's a design pattern, that ensures that a class has exactly one instance across the entire application,
 * and provides a global point of access to it.
 *
 * Benefits:
 * - No instance creation required
 * - Global shared state
 */

// Declare Singleton
object Counter {
    var count = 0
}

fun main() {
    println(Counter.count)
    Counter.count++ // increment the counter
    println(Counter.count)
}