package strings

/**
 * String Template/Interpolation
 * Using a variable or an expression within the string.
 * `$` character is used for single variable,
 * whereas for an expression we use `${expression goes here}` syntax
 */

const val currentYear = 2026

fun main(){
    println("Enter your name: ")
    val name = readln()

    println("Enter your age: ")
    val age = readln().toInt()

    println("You are $name, and you born in year ${currentYear - age}.")

}