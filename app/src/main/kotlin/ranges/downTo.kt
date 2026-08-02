package ranges

/**
 * Range (Going Backwards)
 * In Kotlin, closed range `..` operator works for forward counting. To go backwards,
 * if we use `10..1` this sequence then the Kotlin will create an empty range.
 *
 * To count backwards, Kotlin provides us with the `downTo` infix function,
 * which will replace the `..` operator.
 */

fun main() {
    // Counting backwards (will print - 10,9,8,7,6,5,4,3,2,1)
    for (i in 10 downTo 1) {
        println(i)
    }
}