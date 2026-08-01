package functions

/**
 * Function (parameter)
 * We can pass some informtion to a function during invocation within the parenthesis of the function.
 * Passed value is called an argument, and at the time of definition we define parameters with type.
 */

fun greet(name: String){ // Parameter is here (in the definition)
    println("Hello $name")
}

fun main() {
    println("Hi! May I know your name please")
    greet(readln()) // Argument is here (in the execution)
}