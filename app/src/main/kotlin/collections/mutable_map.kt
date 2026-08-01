package collections

/**
 * Map (mutable)
 * In Kotlin, we can define a mutable map of items using `mutableMapOf()`
 */
fun main() {
    var employee = mutableMapOf(
        "name" to "Alok Singh",
        "experienceInYears" to 2,
        "hometown" to "Banda",
        "profession" to "Flutter Developer"
    )
    println(employee.toString())

    employee = mutableMapOf(
        "name" to "Suresh Kumar Bind",
        "experienceInYears" to 2,
        "hometown" to "Mirzapur"
    )
    println(employee.toString())
}