package data_classes

/**
 * Data Class (`.toString()`)
 * Similar to the `copy()` method, Kotlin automatically generates a `toString()` method for the data classes,
 * to reduce the repetitive boilerplate code.
 *
 * This method converts and object's values into formatted string (i.e., `ClassName(propertyA, propertyB)`)
 */

fun main() {
    val alok = User("Alok", 25, highestQualification = "Diploma")

    println(alok)
    println(alok.toString())
}