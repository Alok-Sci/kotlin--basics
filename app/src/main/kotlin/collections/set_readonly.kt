package collections

/**
 * Set (readonly)
 * It's a collection. Set eliminates the duplicate values.
 */

fun main(){
    var names = setOf("Alok", "Suresh", "Alok", "Surendra")
    println(names.joinToString("|", prefix = "[", postfix = "]"))
    // ❌ Compile-time error: It's an immutable set
    // names = setOf("Alok Singh", "Suresh Kumar Bind")

    println("Alok" in names) // check whether a value present in the set
}