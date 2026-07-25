package variables

fun main(){
    // read-only variable (can not be re-assigned)
    val name = "Alok Singh"
    // mutable variable (can be changed later)
    var age = "24"

    println("My name is "+name+". I'm "+age+" years old.")
    age = "25"
    println("I'll be "+age+" in November 2026")
}