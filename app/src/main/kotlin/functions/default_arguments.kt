package functions

/**
 * Function (default argument)
 * It supports providing a default argument to a parameter, when not provided during function invocation.
 */

fun getGreetingDefault(name: String? = "Alok Singh"): String {
    return "Hello $name! You got a nice name."
}

fun main() {
    println("Hi! Could you tell us your name?")
    val name = readln()

    println(if (name.isNotEmpty()) getGreetingDefault(name) else getGreetingDefault())
}