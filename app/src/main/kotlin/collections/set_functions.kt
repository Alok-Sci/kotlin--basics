package collections

/**
 * Set (functions)
 * Kotlin provides various extension functions to work with Sets
 */

fun main() {
    var citiesIHaveBeenTo = mutableSetOf("Banda", "Jhansi", "Mahoba") // Create a set
    citiesIHaveBeenTo.add("Lucknow") // Add new item
    citiesIHaveBeenTo.addAll(elements = mutableSetOf("Lucknow", "Kanpur", "Gurugram")) // Add all items
    println(citiesIHaveBeenTo.elementAt(0)) // access item using index number
    println(citiesIHaveBeenTo.toList()) // convert into list
    println(citiesIHaveBeenTo.first()) // Get the first item
    println(citiesIHaveBeenTo.last()) // Get the last item
    println(citiesIHaveBeenTo.contains("Lucknow")) // Check whether the specific item is present
    println(
        citiesIHaveBeenTo.containsAll(mutableSetOf("Lucknow", "Kedarnath"))
    ) // Check whether all the items are present
    citiesIHaveBeenTo.clear() // Empty the set
    println(citiesIHaveBeenTo.toList())
}