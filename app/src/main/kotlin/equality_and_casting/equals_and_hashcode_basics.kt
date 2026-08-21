package equality_and_casting

/**
 * Equality (`equals()` and `hashCode()`)
 *
 * `equals()` compares the object's content. But if not overridden then `==` fall back to the referential comparison.
 * `hashCode()` returns a 32-bit signed integer (Int) representation of an object. Used for efficient lookup,
 * indexing and storage in hash-based collections, such as `HashMap` and `HashSet`
 */

// A model without `equals()`/`hashCode()` overridden
// Representing an old DTO class
class RegularUser(val name: String, val age: Int)

// A model build for value comparison
// Representing a state class
data class DataUser(val name: String, val age: Int)

fun main() {
    // Regular classes requires manual equals(), and hashCode() methods override
    val regularUser1 = RegularUser("Alok", 24)
    val regularUser2 = RegularUser("Alok", 24)
    println("Regular users equal: ${regularUser1 == regularUser2}") // false - requires equals() method override

    // Data class, by default override equals(), and hashCode() methods
    val dataUser1 = DataUser("Alok", 24)
    val dataUser2 = DataUser("Alok", 24)
    println("Data users equal: ${dataUser1 == dataUser2}") // true - property values of both objects is same
    println("Hash codes equal: ${dataUser1.hashCode() == dataUser2.hashCode()}") // true

    // HashSet relies on equals()/hashCode() to detect duplicates
    val uniqueUsers = setOf(dataUser1, dataUser2)
    println("Unique users in set: ${uniqueUsers.size}") // 1, as the dataUser1 == dataUser2 (true)

    val uniqueRegularUser = setOf(regularUser1, regularUser2)
    println("Unique regular users in set: ${uniqueRegularUser.size}") // 2, as the regularUser1 == regularUser2 (false)
}