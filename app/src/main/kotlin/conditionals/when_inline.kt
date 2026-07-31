package conditionals

/**
 * When Conditional (can be used in an assignment operation)
 * Unlike other languages, we can directly assign a when block to a variable
 */

fun main() {
    println("What's your age?")
    val age = readln().toIntOrNull()

    val canVote = when (age) {
        in 0..17 -> false
        in 18..80 -> true
        else -> false
    }

    when (canVote) {
        true -> println("You can vote")
        false -> println("You can't vote")
    }
}