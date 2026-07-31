package loops

/**
 * For Loop
 * It is used to iterate over a collection or anything that
 * provides and iterator (i.e., list, set, map, arrays, string, etc.)
 */
fun main(){
    println("Enter your name: ")
    for(i in readln()){
        println("$i")
    }
}