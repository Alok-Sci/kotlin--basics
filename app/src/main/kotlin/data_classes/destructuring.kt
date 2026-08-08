package data_classes

/**
 * Data Class (destructuring)
 * Destructuring helps in extracting the values from an object.
 *
 * `_` character is a placeholder or wildcard. It tells the compiler to skip that specific variable.
 */

fun main() {
    val alok = User("Alok Singh", age = 24)

    val (alokName, alokAge) = alok // destructuring an object into two variables

    println(alokName)
    println(alokAge)

    /**
     * In data classes, Kotlin also generates the `component1()`, `componentN()` hidden functions to
     * directly refer to the specific variable
     */
    println(alok.component1())
    println(alok.component2())
}