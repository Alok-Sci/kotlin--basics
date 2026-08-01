package collections

/**
 * List (mutable)
 * In Kotlin, we can define a mutable list of items using `mutableListOf()`
 */

fun main(){
    var names = mutableListOf("Alok", "Suresh", "Surendra")
    names.add("Harshit")
    println(names.joinToString("|", prefix = "[", postfix = "]" ))

    names = mutableListOf("Alok Singh", "Suresh Kumar Bind", "Surendra Pal")
    println(names.joinToString("|", prefix = "[", postfix = "]" ))
}