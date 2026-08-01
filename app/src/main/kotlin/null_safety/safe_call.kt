package null_safety

/**
 * Safe-Call Operator (?.)
 * It's an operator used to safely access a nullable variable that might be null.
 * It replaces messy, multiline if-else null check with clean, crash-proof code.
 */

fun main() {
    val salary: Int?
    println("Enter your last CTC: ")
    salary = readln().trim().toIntOrNull()

    println(salary?.toString())
}