package oop

/**
 * Visibility Modifiers
 * These are the keywords that control which parts of your code (like classes, objects, interfaces,
 * constructors, functions or properties) can see and use other parts of the code.
 *
 * Kotlin has four visibility modifiers:
 * 1. `public`: Kotlin automatically makes everything public. It makes the code visible everywhere
 * 2. `private`: Restricts access to the file when top-level and to class if defined in inside a class.
 * 3. `protected`: Behaves exactly like the `private`, but with one exection - it's visible to subclasses.
 *                 Rule: This cannot be used with the top-level functions and classes.
 * 4. `internal`: This modifier makes the code visible anywhere inside the same module, but hidden from
 *                any external projects or libraries that import your module
 */

// 1. Public (The 'public' keyword is optional and omitted here)
open class Bus {
    val seatCount: Int = 20 // Accessible everywhere
    private var engineSerial: String = "BB99X" // Hidden! Only accessible INSIDE this Bus class

    // 2. Protected: Only the Bus class and its child classes can access this.
    protected var commercialLicenseType: String = "Class-A"

    fun startTrip() {
        // Inside the class, we can see private fields perfectly fine
        println("Starting engine $engineSerial")
    }
}

// Subclass extending Bus to show how 'protected' works
class SchoolBus : Bus() {
    fun printRequirements() {
        // SchoolBus can see 'commercialLicenseType' because it inherits from Bus.
        println("Driver needs a $commercialLicenseType license.")

        startTrip()

        // ❌ Cannot access 'engineSerial' because it is strictly private to Bus.
        // println(engineSerial)
    }
}

// 3. Internal: Visible to any file inside this module, but invisible to external clients.
internal class Truck {
    val cargoCapacityTons: Double = 12.5
}

// 4. Private: Only other code written inside this EXACT same file can see or use 'SecretPrototype'.
private class SecretPrototype {
    val topSpeed: Int = 300
}

fun main() {
    val myBus = Bus()

    println(myBus.seatCount)

    // myBus.engineSerial = "XYZ" // ❌ Compiler Error! It is private.
    // myBus.commercialLicenseType // ❌ Compiler Error! It is protected (main is not a subclass).

    val myTruck = Truck()

    // val secret = SecretPrototype() // ❌ Compiler Error! It is private to its own file.
}
