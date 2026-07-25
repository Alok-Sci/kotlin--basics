package variables

fun main(){
    val immutableNumberList = mutableListOf(12,23)
    // ❌ incorrect: list defined with val cannot be re-assigned
    // immutableNumberList = mutableListOf(30, 45)
    immutableNumberList.add(23)


    var mutableNumberList = mutableListOf(12,23)
    mutableNumberList = mutableListOf(34, 26)
    mutableNumberList.add(23)

    println(immutableNumberList)
    println(mutableNumberList)
}