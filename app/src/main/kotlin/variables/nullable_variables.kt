package variables

/**
 * NULLABLE TYPE VARIABLE
 * A type followed by a question mark ([String?]) explicitly permits [null] values.
 *
 * Rules for Nullable Types:
 * - Protects against NullPointerExceptions (NPE) at compile time.
 * - Requires safe calls (`?.`) when calling methods on it.
 * - Helps developers explicitly declare whether a reference can be missing/empty.
 */
fun main(){
    // Nullable types can hold null
    var nickname:String? = "Scientist"
    println(nickname)

    nickname = null
    println(nickname)
}