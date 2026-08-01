package functions

/**
 * Function (named argument)
 * It Kotlin, we can have named arguments in function which helps in readability and
 * reduce confusion which comes with positional arguments. This way we don't need to keep track of the
 * position of the parameter, we just need to know the name of the argument.
 */

fun getGreetingNamed(name: String? = "Alok Singh"): String {
    return "Hello $name! You got a nice name."
}

fun main() {
    println("Hi! Could you tell us your name?")
    val input = readln()

    println(if (input.isNotEmpty()) getGreetingNamed(name = input) else getGreetingNamed())
}