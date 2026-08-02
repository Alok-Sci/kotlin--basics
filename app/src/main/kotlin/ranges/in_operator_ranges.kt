package ranges

/**
 * Range (checking membership with `in` and `!in`)
 * `in` operator checks whether a specific value exists inside a range interval. It returns a `Boolean`.
 *
 * It works seamlessly with `if` statements.
 */

fun main() {
    println("Enter a number (under 100): ")
    val number = readln().toInt()

    // We can store the range in variables
    val startRangeValue = 0
    val endRangeValue = 100
    val range = startRangeValue..endRangeValue

    // Print even number between 0 - 10
    if (number !in range) {
        println("Please input number less than 100")
    } else if (number in range step 2) {
        println("$number is an even number")
    } else {
        println("$number is an odd number")
    }
}