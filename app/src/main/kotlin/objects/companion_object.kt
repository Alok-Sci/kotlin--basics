package objects

/**
 * Companion Object
 * Is an object that is nested inside a regular class.
 * It is simply the Kotlin's method of writing `static` class members. Kotlin doesn't have a `static` keyword.
 * We put all those methods and properties inside the `companion object` block, which we want to make
 * statically accessible via the class name, without creating an instance.
 *
 *
 * Rule: A class can have only one `companion object`.
 */

data class User(var name: String, var age: String, var email: String) {
    /**
     * Kotlin also supports "Named Companion Object".
     * By default, every companion object has the name `Companion` under the hood.
     *
     * Example: factory constructors to serialize/deserialize the `json`.
     */
    companion object Parser {
        fun fromJson(json: Map<String, Any>): User {
            return User(
                name = json["name"] as String,
                age = json["age"] as String,
                email = json["email"] as String
            )
        }

        fun toJson(user: User): Map<String, Any> {
            return mutableMapOf(
                "name" to user.name,
                "age" to user.age,
                "email" to user.email
            )
        }
    }
}

class Validators {
    /**
     * Methods and Properties which we want to make accessible via class name,
     * without creating an instance are put inside the companion object.
     */
    companion object {
        fun isValidName(name: String?): Boolean {
            if (name.isNullOrBlank()) return false
            for (char in name) {
                if (char.isDigit()) return false
            }
            return name.length >= 3
        }

        fun isValidAge(age: String?): Boolean {
            return !(age.isNullOrBlank() || age.toByteOrNull() == null) && age.toByte() in 0..100
        }

        fun isValidEmail(email: String?): Boolean {
            return !email.isNullOrBlank() && email.split("@").last().contains("gmail.com")
        }
    }
}

fun main() {
    println("Please fill out the fields for your registration: ")
    println("Enter name: ")
    val name = readln()
    // Validate name (Using default companion object name `Companion`
    if (!Validators.Companion.isValidName(name)) {
        println("Invalid Name. You are not eligible.")
        return
    }

    println("Enter age: ")
    val age = readln()
    // Validate age
    if (!Validators.isValidAge(age)) {
        println("Invalid Age. You are not eligible.")
        return
    }

    println("Enter email: ")
    val email = readln()
    // Validate email
    if (!Validators.isValidEmail(email)) {
        println("Invalid Email. You are not eligible.")
        return
    }

    println("Thank your for registering!")

    // Invoking the fromJson static method without companion object name
    val user = User.fromJson(mutableMapOf("name" to name, "age" to age, "email" to email))
    println("Please verify your details: ")

    // Invoking the toJson static method with companion object name
    println(User.Parser.toJson(user))
    println(user)
}