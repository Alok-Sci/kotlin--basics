package collections

/**
 * Map (readonly)
 * It's a collection. Map allows us to define a key-value pair.
 * For defining key-value pair we can use `to` keyword this way `key to value`
 */

fun main() {
    var employee =
        mapOf(
            "name" to "Alok Singh",
            "age" to 24,
            "profession" to "Flutter Developer",
            "hometown" to "Banda"
        )
    // ❌ Compile-time error: It's an immutable map
    // names = mapOf("name" to "Suresh Kumar Bind", "age" to 24, "profession" to "Web Developer", "hometown" to "Mirzapur")
    println("You are ${employee["name"]} and you are ${employee["age"]} years old ${employee["profession"]}")
}