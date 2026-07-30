package operators

/**
 * Increment Decrement Operator
 * These are very much similar to the Augmented Assignment Operators
 * in context to their behavior, although syntax differs.
 *
 * Increment Operator (++): Increases the value by 1 (equivalent to x += 1)
 * Decrement Operator (--): Decreases the value by 1 (equivalent to x -= 1)
 *
 * These operators can be placed before or after the variable:
 * Pre-increment/Pre-decrement (++x / --x): Updates the variable first,
 * then passes the new value to the current statement.
 *
 * Post-increment/Post-decrement (x++ / x--): Passes the current value to
 * the statement first, then updates the variable in memory.
 */

fun main(){
    var number = 203
    println(number) // 203
    println(number++) // 203
    println(number) // 204
    println(++number) // 205
    println(number) // 205
    println(number--) // 205
    println(number) // 204
    println(--number) // 203
    println(number) // 203
}