package null_safety

/**
 * Elvis Operator (`?:`)
 * It's an operator used to provide a default value in case an expression evaluates to `null`.
 */

fun main() {
    val salary: Int?
    println("Enter your last CTC: ")
    salary = readln().trim().toIntOrNull()

    println(salary?.toString() ?: "No past CTC? Are you a fresher?")
}