package oop

/**
 * Class
 * It's a blueprint or template for creating objects. It defines a real-world entity having
 * some behavior and property.
 *
 * State/Attributes (Properties): The data it holds.
 * Behaviors/Actions (Methods): The actions it can perform.
 */

class Employee {
    // Properties (members of the class)
    var name: String? = null
    var age: Int? = null
    var profession: String? = null
    var city: String? = null
}

fun main() {
    // creating an object of the class Employee
    val employee = Employee()

    /**
     * In Kotlin, you do not write explicit .setName() or .getName() methods.
     * Kotlin automatically creates hidden getters and setters for you.
     */

    // Using Setters
    employee.name = "Alok Singh"
    employee.age = 24
    employee.profession = "Flutter Developer"
    employee.city = "Banda"

    // Using Getters
    println(employee.name)
    println(employee.age)
    println(employee.profession)
    println(employee.city)
}