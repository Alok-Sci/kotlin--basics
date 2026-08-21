package equality_and_casting

/**
 * Type Checking
 * In Kotlin, using `is` operator we can check if a value is of a particular type.
 * And `!is` (is not) operator is just opposite of `is`. It checks if a value is not of a specified type.
 */

fun main() {
    // Dynamic data. Similar to a part of JSON data, but in a List format, instead of a Map
    val payloads: List<Any> = listOf("#Order124", 404, true)

    for (payload in payloads) {
        // Run this statement if payload IS of type `String`
        if(payload is String) println("Received order id: $payload")

        // Run this statement if payload IS NOT of type `Boolean`
        if(payload !is Boolean) println("Not a status flag: $payload")
    }
}