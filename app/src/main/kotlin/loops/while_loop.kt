package loops

/**
 * While Loop
 * This loop runs until the condition provided in the parenthesis becomes false
 */

fun main(){
    println("Enter a number: ")
    var number = readln().toInt()

    while(number >= 0){
        print("${number--} ")
    }
}