package conditionals

/**
 * If-Else Conditionals in expression
 * When we only need to perform a single operation for if and else blocks
 * then we can simply the statement, by making it inline and removing the block syntax.
 */

fun main(){
    val isMale = true

    println(if(isMale) "You are physically strong" else "You are emotionally strong")
}