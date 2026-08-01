package collections

/**
 * Collection (iteration)
 * In Kotlin, we can iterate over items in the collection using a loop
 */

fun main() {
    val clientLocations = listOf("Hyderabad", "Bangalore", "America", "Malaysia", "Timor-Leste", "Japan")
    for (clientLocation in clientLocations) println(clientLocation)

    val clients = setOf("Winnie", "Winnie", "Reona", "MK Reddy")
    for (client in clients) println(client)

    val project =
        mapOf(
            "type" to "application",
            "name" to "eMedFile",
            "clientName" to "MK Reddy",
            "plaforms" to setOf("iOS", "Android"),
            "country" to "India",
            "city" to "Bangalore",
        )
    for(entry in project) println("${entry.key}: ${entry.value}")

}