package data_classes

/**
 * Data Class (copy function)
 * `copy()` function is an automatically generated utility method in a `data` class.
 * It helps in creating more objects reusing the existing data of an object with some modification.
 */

fun main() {
    val alok = User("Alok", 25)
    val suresh = alok.copy(name = "Suresh")

    println(alok)
    println(suresh)
}