package functions

/**
 * Function Overloading
 * It's a Kotlin feature that lets us use the exact same function name,
 * as long as they have different input parameters.
 */

fun greetMorning(name: String? = "Alok Singh"): String {
    return "Hello $name! Good Morning!."
}

fun greetMorning(firstName: String, lastName: String?): String {
    return "Good Morning $firstName $lastName"
}

fun main() {
    println(greetMorning("Alok Singh"))
    println(greetMorning("Alok", "Singh"))
}