package loops

/**
 * For Loop (with ranges)
 * In for loop we can provide ranges as well
 */

fun main(){
    println("Enter the range start number: ")
    val rangeStart = readln().toInt()

    println("Enter the range end number: ")
    val rangeEnd = readln().toInt()

    for (i in rangeStart..rangeEnd){
        print("$i ")
    }
}