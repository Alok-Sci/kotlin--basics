package objects

/**
 * Sealed Class
 * These are like Enum on Steroid. These classes let us have a fixed set of subclasses,
 * but each can have different properties and data.
 *
 * `sealed class` keyword is used to define a sealed class.
 */

sealed class NetworkState {}

object Loading : NetworkState() // a singleton

data class Success(val message: String) : NetworkState()
data class Failure(val errorMessage: String, val errorCode: String) : NetworkState()

fun main() {
    lateinit var state: NetworkState

    state = Loading // loading state
    println("Enter your name: ")
    val name = readln()

    state = if (name.isNotEmpty()) {
        Success(name.trim()) // success state
    } else {
        Failure(
            errorMessage = "No name found!",
            errorCode = "NAME_NOT_FOUND"
        ) // failure state
    }

    println(state.toString())
}