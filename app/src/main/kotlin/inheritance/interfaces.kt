package inheritance

/**
 * Interface
 * In Kotlin, it is a custom contract. It defines "What" an object can do, without enforcing "How" it does.
 *
 * By default, Interfaces doesn't require the properties or methods to use `abstract`
 * to be unimplemented (abstract).
 * Similar to abstract classes, interfaces in Kotlin can contain both implemented (concrete)
 * and unimplemented (abstract) members
 *
 * Rule: We can't assign a direct initial value to a property.
 *
 * Difference between an abstract class and an interface:
 * 1. A class can inherit multiple interfaces, but can only inherit from one class.
 * 2. Interface can't hold state (fields with default value), whereas the abstract class can.
 * 3. Interface defines a "capability", whereas the abstract class defines the "identity".
 */

interface Turnable {
    // Abstract property (No initial value)
    val brandName: String

    // Abstract method (No code body OR implementation details)
    fun turnOn()

}

interface Chargeable {
    // Abstract property. Overriding is mandatory for implementor classes.
    val batteryCapacity: Double

    // Concrete property. Uses a custom getter.
    val isHeavyDuty: Boolean
        get() = batteryCapacity >= 5.0

    // Concrete method. Can be used by implementor classes as it is.
    fun checkPowerSource(isPluggedIn: Boolean) {
        if(isPluggedIn) {
            println("Running on AC power...")
        } else {
            println("Running on backup battery...")
        }
    }
}

/**
 * In Kotlin, a class can can implement multiple interfaces. A `,` is used as "delimiter" for interface names.
 */
class ElectricStandFan : Turnable, Chargeable {
    // Satisfy `Turable.brandName` and `Chargeable.batteryCapacity` contract
    override val brandName: String = "Havells Rechargeable Pro"
    override val batteryCapacity: Double = 7.5

    // Implement `Turnable.turnOn()`
    override fun turnOn() {
        println("$brandName is turned on. Running at low speed...")
    }
}

fun main() {
    val portableTableFan = ElectricStandFan()

    println("---Device Hardware Specs---")

    // Overridden abstract property from `Turnable` interface
    println("Brand: " + portableTableFan.brandName)

    // Overridden abstract property from `Chargeable` interface
    println("Battery Capacity: " + portableTableFan.batteryCapacity + "Ah")

    // Concrete property from `Chargeable` interface
    println("Heavy Duty: " + portableTableFan.isHeavyDuty)

    // Concrete method from `Chargeable` interface
    portableTableFan.checkPowerSource(true)

    // Invoke overridden abstract method from `Turnable` interface
    portableTableFan.turnOn()
}