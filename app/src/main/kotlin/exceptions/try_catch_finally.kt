package exceptions

// Import Dependencies
import java.util.Scanner
import java.io.File
import java.io.FileNotFoundException

/**
 * Exception Handling (try-catch-finally)
 * `try`,`catch`, and `finally` blocks are used altogether to handle "runtime exceptions".
 *
 * In `try` block, we put the code which might throw an exception.
 * In `catch` block, we handle an exception if one occurs.
 * In `finally` block, we put code which needs to be run regardless of the exception occurrence
 */

fun main() {
    // scanner to scan the content of the file.
    var fileScanner: Scanner? = null

    // attempt running this code block
    try {
        println("1. Attempt opening file...")
        // filename with absolute path
        val fileName = File("data.txt")

        // attempt reading the file. If the file is missing then this will throw a runtime `FileNotFoundException`
        fileScanner = Scanner(fileName)

        // `fileScanner.hasNextLine()` checks whether there is a next line
        while(fileScanner.hasNextLine()) {
            println("File content: ${fileScanner.nextLine()}")
        }
    }
    // If an exception occurs, catch it and redirects the execution flow here
    catch(e: Exception) {
        println("2. Handling exception...")
        // Log the specific error message
        println(e.message)
    }
    // `finally` block runs regardless of the exception occurrence.
    finally {
        println("3. Executing cleanup...")
        // Close the scanner and free up the resources
        if(fileScanner != null){
            fileScanner.close()
            println("Resource safely closed")
        } else {
            println("No resource was opened, nothing to clean up")
        }
    }
}