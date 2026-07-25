package variables

/**
 * 1. TOP-LEVEL SCOPE
 * Visible everywhere within the package (and project, unless marked private).
 * Initialized when the program starts and lasts for the entire runtime.
 */
val topLevelVariable = "TopLevel"

fun main() {
    /**
     * 2. LOCAL SCOPE (Function Scope)
     * Visible anywhere inside this main() function, including inner blocks.
     * Destroyed when the function finishes execution.
     */
    val outerName = "Alok Singh"

    if (true) {
        /**
         * 3. BLOCK SCOPE
         * Visible strictly inside these if-statement curly braces.
         * Inner blocks can look "up" to access outer local and top-level variables.
         */
        val innerName = "Scientist"
        println(innerName)
        println(outerName)       // ✅ Valid: Accessing outer local variable from an inner block
        println(topLevelVariable) // ✅ Valid: Accessing global top-level variable from an inner block
    }

    // ❌ COMPILE ERROR: innerName is block-scoped and does not exist out here
    // println(innerName)

    // ✅ Valid: outerName is still inside its local function scope
    println(outerName)

    // ✅ Valid: topLevelVariable is globally accessible and valid here too
    println(topLevelVariable)
}
