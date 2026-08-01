package functions

/**
 * Function (return value)
 * In Kotlin, functions can return some value to where they are invoked.
 *
 * At the time of function definition, we define the return type after the parameters'
 * closing parenthesis, separated by a colon (`:`). Then, at the end of the function's code
 * when we need to send the value back, we use the `return` keyword.
 */

fun getGreeting(name: String): String {
    return "Hello $name! You got a nice name."
}

fun main() {
    println("Hi! Could you tell us your name?")
    println(getGreeting(readln()))
}