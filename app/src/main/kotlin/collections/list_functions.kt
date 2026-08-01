package collections

/**
 * List (functions)
 * Kotlin provides various extension functions to work with Lists
 */

fun main() {
    var animals = mutableListOf<String>("Kangaroo", "Buffalo") // Create a map
    println(animals)

    /* Index */
    println(animals[1]) // Access items using index number
    println(animals.indexOf("Buffalo")) // Access items using index number
    println(animals.count()) // Access items using index number
    println(animals.size) // Access items using index number

    /* Add */
    animals.add("Rabbit") // Add a new key-value pair
    animals.addFirst("Elephant") // Add a new key-value pair
    animals.addLast("Lion") // Add a new key-value pair
    println(animals.add(index = 1, element = "Boar")) // Access items using index number
    animals.addAll(mutableListOf("Deer", "Racoon")) // Add all items

    /* Remove */
    println(animals.remove("Rabbit")) // remove specific entry and returns boolean
    println(animals.removeFirst()) // removes first entry and returns boolean
    println(animals.removeLast()) // removes last entry and returns boolean
    println(animals.removeAt(0)) // removes item at specified index
    println(animals.clear()) // Empty the set

    /* Operation */
    println(animals.reverse()) // Reverse list
    println(animals.shuffle()) // Shuffle list
    println(animals.sort()) // Sort list

    /* Check */
    println(animals.contains("hometown")) // Check whether the specific item is present
    println(animals.isEmpty()) // Check whether the list is empty
    println(animals.isNotEmpty()) // Check whether the list is not empty
    println(animals.takeLast(3)) // Check whether the list is not empty

    /* Transform */
    println(animals.toSet())
    println(animals.toString())
}