package conditionals

/**
 * When Conditional (with ranges)
 * It can be used with ranges as well
 *
 * In Kotlin, we use the `in` keyword before mentioning a range inside when block
 */

fun main(){
    println("Enter a number: ")

    when(readln().toInt()) {
        in 0..9 -> println("Ones")
        in 10..99 -> println("Tens")
        in 100..999 -> println("Hundreds")
        in 1000..9999 -> {
            // We can use block for multiple statements
            println("Thousands")
        }
        else -> println("Number is greater than thousands Or isn't a compatible number")
    }
}