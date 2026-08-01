package functions

/**
 * Function (single expression)
 * In Kotlin, we can define function in single line and less boilerplate code,
 * when the function contains only single expression.
 */

fun multiply(num1: Int, num2: Int): Int = num1 * num2

fun main() {
    println("Enter first number: ")
    val num1 = readln().toInt()

    println("Enter second number: ")
    val num2 = readln().toInt()

    println("$num1 * $num2 = ${multiply(num1, num2)}")

}