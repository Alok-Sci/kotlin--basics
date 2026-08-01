package null_safety

/**
 * Nullable Functions
 * In Kotlin, we can invoke functions on nullable variables
 * by checking if they are not null using Elvis operator (`?.`),
 * this way the functions will run only when the value is not `null`
 */

fun main() {
    var name: String? = " Alok , Singh"
    name = name?.trim()?.replace(",", "")?.uppercase()?.split(" ")[0]

    println(name)
}