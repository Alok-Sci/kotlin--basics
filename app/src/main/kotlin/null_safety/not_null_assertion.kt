package null_safety

/**
 * Not-Null Assertion Operator (`!!`)
 * It explicitly tells the compiler that the value of a nullable variable will not be `null`.
 */

fun main() {
    var salary: Int? = 0
    println("Enter your last CTC: ")
    salary = readln().trim().toIntOrNull()

    println(salary!!)
}