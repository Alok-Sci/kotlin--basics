package data_classes

/**
 * Data Classes
 * Special type of class designed specifically to hold and store data
 *
 * When a class is declared as a `data` class, then Kotlin automatically generates following things
 * for that class, without us having to manually write the repetetive boilerplate code.
 * 1. `.toString()` method
 * 2. `==` operator, `equals()`, and `hashCode()` function
 * 3. `copy()` function
 * 4. Destructuring declaration
 */

data class User(val name: String, val age: Int) {
    var highestQualification = "12th"
    constructor(name: String, age: Int, highestQualification: String): this(name, age){
        this.highestQualification = highestQualification
    }
}

fun main() {
    val alok = User("Alok Singh", age = 24)

    val alokVerma = alok.copy(name = "Alok Singh")

    println(alok)
    println(alokVerma)

    println(alok == alokVerma)
    println(alok.equals(alokVerma))

    println(alok.hashCode())
    println(alokVerma.hashCode())
}