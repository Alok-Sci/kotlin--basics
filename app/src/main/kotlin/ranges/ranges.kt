package ranges

/**
 * Range
 * In Kotlin, range are used to define a sequence of values,
 * most commonly numbers (Int, Long), and characters (Char)
 *
 * When defining the range we mention the `start value` then `..`/`..<` character then `end value`
 *
 * There are two types of range operators
 * 1. Closed Range (`..`) Operator
 * 2. Open-ended Range (`..<`) Operator
 */

fun main() {
    // Closed range (will print - 1,2,3,4,5,6,7,8,9,10)
    for(i in 1..10){
        println(i)
    }

    // Open-ended range (will print - 1,2,3,4,5,6,7,8,9)
    for(i in 1..<10){
        println(i)
    }
}