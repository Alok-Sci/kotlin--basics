package operators

/**
 * Logical Operators
 * These operators compare two boolean expressions and accordingly return a Boolean value
 * Kotlin Supports 3 Logical Operators:
 * && - AND (both expressions should return true to be true, else it will result into false)
 * || - OR (one out of two expressions need to be true to be true)
 * ! - NOT (it negates the result, e.g., if the expression returns true, then this will make it false)
 */
fun main(){
    val isFemale = false
    val isAdult = true

    println(isFemale && isAdult) // AND
    println(isFemale || isAdult) // OR
    println(!isFemale) // NOT
}