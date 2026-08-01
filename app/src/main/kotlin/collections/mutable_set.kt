package collections

/**
 * Set (mutable)
 * In Kotlin, we can define a mutable set of items using `mutableSetOf()`
 */

fun main(){
    var names = mutableSetOf("Alok", "Suresh", "Surendra", "Alok")
    println(names.joinToString("|", prefix = "[", postfix = "]" ))

    names = mutableSetOf("Alok Singh", "Suresh Kumar Bind", "Surendra Pal")
    println(names.joinToString("|", prefix = "[", postfix = "]" ))
}