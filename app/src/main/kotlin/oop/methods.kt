package oop

/**
 * Method
 * It is a function that is declared inside a class. Method is like a
 * behavior or actions that an object can perform. It's also known as `member function`.
 *
 * Methods have direct access to the class's properties that they belong to. They can read or
 * modify the object's state at any time
 *
 * Methods are called using the dot (`.`) operator.
 */

class Dog(val name: String) {
    var age: Int = 0

    // Secondary constructor
    constructor(name: String, age: Int) : this(name) {
        this.age = age
    }

    // Declaring a method (member function)
    fun bark() {
        println("Woof Woof! I am $name")
    }

    fun isAdult(): Boolean = age >= 1
}

fun main() {
    val peterDog = Dog("Peter") // uses primary constructor
    val tommyDog = Dog("Tommy", age = 2) // uses secondary constructor

    // Calling the method
    peterDog.bark()
    println(peterDog.isAdult())
    tommyDog.bark()
    println(tommyDog.isAdult())
}