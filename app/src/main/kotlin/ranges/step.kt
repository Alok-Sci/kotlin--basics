package ranges

/**
 * Range (Skipping iterations)
 * Kotlin allows us to skip values or jump by a different number. To do this, `step` infix function
 * is used just after the range and then we mention the `numberOfStepsToJump`.
 */

fun main() {
    // Print even number between 0 - 10
    for (i in 0..10 step 2) {
        println(i)
    }

    // It can be combined with the `downTo` operator
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}