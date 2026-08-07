package oop

/**
 * `init` block (short for initializer block)
 * It is a special block of code inside a Kotlin class that runs automatically
 * the exact moment an object is created
 *
 * `init` block serves as the primary constructor's body.
 */

class Cat(val name: String){
    var age: Int? = null

    // This runs automatically during object creation
    init {
        println("Meow! I am $name, the cat!")
        age = 0
    }
}

fun main() {
    val myCat = Cat("Munni")

    println(myCat.name)
    println(myCat.age)
}