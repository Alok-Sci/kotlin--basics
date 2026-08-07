package oop

/**
 * Property
 * This is the attribute of a class, much like the data or a piece of state
 * that belongs to a class.
 *
 * When we declare a property in Kotlin, the language automatically generates these three things:
 * 1. A Backing Field (`field`): hidden memory slot that holds the data. The `field` keyword can only
 *    be used within getters and setters.
 * 2. A Getter (`.getName()`): A method that reads the data
 * 3. A Setter (`.setName()`): A method to change the data (generated only for mutable `var` properties)
 */

class Student (){
    var name: String? = null
    var age: Int? = null
    var className: Int? = null
}

fun main() {
    // creating an object
    val student = Student()

    /**
     * In Kotlin, you do not write explicit .setName() or .getName() methods.
     * Kotlin automatically creates hidden getters and setters for you.
     */

    // Using Setters
    student.name = "Alok Singh"
    student.age = 24
    student.className = 10

    // Using Getters
    println(student.name)
    println(student.age)
    println(student.className)
}