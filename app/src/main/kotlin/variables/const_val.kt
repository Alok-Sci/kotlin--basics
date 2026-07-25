package variables

// Defines an immutable value known at compile time, not runtime
const val PI = 3.1415926


/*
 * Rules for const val:
 * - Must be declared at the top level or inside a [companion object].
 * - Cannot be used inside local scopes like functions.
 * - The compiler replaces every reference to this variable with its actual literal value in the bytecode.
 */

fun main(){
    // const val is used for compile-time constants
    println(PI)
}