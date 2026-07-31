package loops

/**
 * Nested Loop
 * In Kotlin, we can nest loop inside other loops.
 */

fun main(){
    for(i in 1..8){
        for(j in 1..9){
            if(i == j) continue // skip where i and j are same
            println("($i,$j), ")
        }
    }
}