package inheritance

/**
 * The `super` keyword is used to reference parent class in child class's logic, may it be
 * methods in child class or . Doing this prevents duplicacy of parent member code into child class.
 *
 * The `override` keyword is used to override the behavior of a parent class's/interface's property or method.
 */

/**
 * Class need to be marked `open` to be able to be extended by a subclass.
 * As, in Kotlin, by default, classes and class members are closed (`final`).
 *
 * Closed (`final`) class members can't be overridden in subclasses.
 */
open class Notification {

    // Method is marked `open` so child classes can modify it
    open fun send(message: String) {
        println("Screen wakes up. Light turned on.")
        println("Message received: $message")
    }
}

class UrgentNotification : Notification() {

    // Override the parent method using `override` keyword
    override fun send(message: String) {
        // Using `super` to trigger parent's base logic
        super.send(message)

        // Child-specific custom logic
        println("Play sound: `HighAlert.mp3`")
        println("Vibrate device continuously")
    }
}

fun main() {
    println("--Testing Notification--")
    val standardNotification = Notification()
    standardNotification.send(message = "Your report is ready")

    println("\n--Testing Urgent Notification--")
    val urgentNotification = UrgentNotification()
    urgentNotification.send(message = "Emergency! Tsunami is entering your area")
}