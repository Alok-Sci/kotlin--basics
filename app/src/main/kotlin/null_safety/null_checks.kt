package null_safety

/**
 * Null Check
 * In Kotlin, we can check whether the value of a variable is non-null using `!= null`.
 */

fun main() {
    var salary: Int? = 0
    println("Enter your last CTC: ")
    salary = readln().trim().toIntOrNull()

    // Print the salary only if it's not null
    if (salary != null) println(salary)

}