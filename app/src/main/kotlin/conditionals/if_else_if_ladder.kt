package conditionals

/**
 * If-Else-If Ladder
 * If there are multiple conditions to check and perform multiple operations
 * accordingly then we use this statement, it sequentially
 * checks the operation from top-to-down manner
 */

fun main(){
    println("Enter your age: ")
    val age = readln().toInt()

    if(age <= 1) {
        println("You are from Gen Beta")
    } else if(age > 1 && age <= 13){
        println("You are from Gen Alpha")
    } else if(age > 13 && age <= 29){
        println("You are a GenZ")
    } else if(age > 29 && age <= 45) {
        println("You are a Millenial (GenY)")
    } else if(age > 45 && age <= 61) {
        println("You are a GenX")
    } else if(age > 61 && age <= 80) {
        println("You are a Baby Boomers")
    } else if(age > 80) {
        println("You are from Silent Generation")
    }
}