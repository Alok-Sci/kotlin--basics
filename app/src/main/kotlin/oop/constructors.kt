package oop

/**
 * Constructor
 * It is a special function used to create and initialize an object of a class.
 *
 * In Kotlin, they are split into two types:
 * 1. Primary Constructor: It is the part of the class header. It is the most common and
 *    concise way to define properties and initialize a class.
 * 2. Secondary Constructor: It is an alternative way to create an object. `constructor` keyword
 *    is used to define another constructor.
 *    Rule: Every secondary constructor must hand off responsibility to the primary
 *          constructor using the `this` keyword.
 */

class Worker(val name: String, val phone: String) { // Primary Constructor
    var email: String = ""

    // Secondary Constructor
    constructor(name: String, phone: String, email: String) : this(name, phone) {
        this.email = email // Initialize the extra property
    }
}

fun main() {
    // creating an object
    val amit = Worker("Amit", "9656582658") // uses primary constructor
    val vineet = Worker(
        name = "Vineet",
        phone = "8824845284",
        email = "vineet.sekhar@gmail.com"
    ) // uses secondary constructor

    println(amit.name)
    println(amit.phone)
    println(vineet.name)
    println(vineet.phone)
    println(vineet.email)
}