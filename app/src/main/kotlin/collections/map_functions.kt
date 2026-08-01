package collections

/**
 * Map (functions)
 * Kotlin provides various extension functions to work with Maps
 */

fun main() {
    var employee = mutableMapOf<String, Any>("name" to "Alok Singh", "hometown" to "Banda") // Create a map
    println(employee.toList()) // convert into list
    employee.put(key = "isEmployed", value = false) // Add a new key-value pair
    println(employee.toList()) // convert into list
    employee.putAll(from = mutableMapOf("profession" to "Flutter Developer", "experienceInYears" to 2)) // Add all items
    println(employee.toList()) // convert into list
    println(employee.remove(key = "isEmployed")) // remove specific entry and returns boolean
    employee.put(key = "isEmployed", value = true) // Add a new key-value pair
    println(employee.toList()) // convert into list
    println(employee.entries) // Get all the entries as a MutableSet
    println(employee.keys) // Get all the keys as a MutableSet
    println(employee.values) // Get all the values as a MutableCollection
    println(employee.replace("isEmployed", false)) // Replaces the value of a key
    println(employee.contains("hometown")) // Check whether the specific item is present
    employee.clear() // Empty the set
    println(employee.toList())
}