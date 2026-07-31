package strings

/**
 * String Concatenation
 * Process of adding multiple strings using `+` sign
 *
 * String Templates are the simpler version of String Concatenation,
 * with high readability, and better performance
 */

fun main() {
    println("Enter your name: ")
    val name = readln()

    println("Enter your age: ")
    val age = readln().toInt()

    println("You are" + name + ", and you born in year" + (currentYear - age) + ".")

}