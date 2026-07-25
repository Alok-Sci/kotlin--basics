package variables

/*
 * lateinit var is initialized later "before use"
 *
 * Rules for lateinit:
 * - Must be a mutable variable ([var]).
 * - Cannot be a read-only variable ([val]).
 * - Must be explicitly initialized before any read operation to avoid an UninitializedPropertyAccessException.
 */

lateinit var name: String

fun main(){
    name = "Alok Singh"
    println(name)
}