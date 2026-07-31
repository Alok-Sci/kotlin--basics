package loops

/**
 * Do-While Loop
 * This loop is very similar to the `while` loop. But, it runs at
 * least once even when the condition fails, because condition check
 * happens after the do block is executed
 */

fun main() {
    println("Enter a number: ")
    var number = readln().toInt()

    do {
        print("${number--} ")
    } while (number >= 0)
}