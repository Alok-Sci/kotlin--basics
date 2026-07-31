package conditionals

/**
 * When Conditional (basic values)
 * Simpler alternative to If-else-if ladder, OR we can say a
 * switch statement in other languages with some additional features
 */

fun main(){
    println("Enter a number to find out the corresponding week day name:")

    when(readln().toInt()){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid Day")
    }
}