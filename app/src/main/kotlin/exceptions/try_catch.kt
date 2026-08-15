package exceptions

/**
 * Exception Handling (try-catch)
 * `try` and `catch` blocks are used together to handle "runtime exceptions".
 *
 * In `try` block, we put the code which might throw an exception.
 * In `catch` block, we handle an exception if one occurs.
 */

fun main() {
    // attempt running this code block
    try {
        println("Try block")
        // dividing a number by zero throws a runtime `ArithmeticException: / by zero`
        val result = 10 / 0
        println(result)
    }
    // If an exception occurs, catch it and redirects the execution flow here
    catch (e: Exception) {
        println("Catch block")
        // Use the exception type and error message for console output or some other purpose.
        println(e)
    }
}