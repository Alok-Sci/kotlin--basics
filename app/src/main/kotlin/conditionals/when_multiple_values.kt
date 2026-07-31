package conditionals

/**
 * When Conditional (multiple values)
 * It also supports checking multiple value at the same time
 * and perform a single operation for all the matching grouped values
 */

fun main(){
    println("Write a alphabet to find out whether it's a vowel or consonant")

    when (readln().toCharArray()[0]) {
        'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> println("Vowel")
        else -> println("Consonant")
    }
}