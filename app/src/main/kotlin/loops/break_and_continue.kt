package loops

/**
 * Break and Continue
 * Both are keywords which Kotlin provides for loops.
 * `break` keyword skips all the pending iteration of the loop
 * `continue` keyword skips the current iteration of the loop
 */

fun main() {
    for (i in 1..100) {
        if (i % 2 == 0) continue // will skip the even numbers' iteration
        println(i)
        if (i == 55) break // will break the look in 55th iteration
    }
}