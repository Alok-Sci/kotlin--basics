package variables

/*
 * For variable names we use the `camelCase` naming convention.
 *
 * Good names are clear and readable
 */
fun main() {
    val employeeName = "Alok Singh"
    val _employeeCtcInLpa = 216000

    println(employeeName::class.simpleName)
    println(_employeeCtcInLpa::class.simpleName)
}