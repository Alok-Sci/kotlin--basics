package inheritance

/**
 * Abstract Class
 * It a conceptual blueprint. An `abstract class` cannot be instantiated directly.
 * Its purpose is to define a common interface and shared behavior that other concrete classes must implement.
 *
 * By default, `abstract` classes are automatically `open`.
 */

abstract class Vehicle() {
    /**
     * Abstract classes can contain both implemented (concrete) and unimplemented (abstract)
     * class members (methods and properties).
     */

    // Abstract (unimplemented) Property. Cannot be initialized.
    // Subclasses are strictly required to initialize or override this property.
    abstract val fuelType: String

    // Concrete (implemented) Property. Can be initialized.
    var currentSpeed: Int = 0

    // Abstract (unimplemented) Method. Have no body.
    // Subclasses are required to provide their own custom implementation details
    abstract fun accelerate()

    // Concrete (implemented) Method. All subclasses inherit this logic without needing to re-write it.
    fun applyBrakes() {
        if (currentSpeed > 0) {
            currentSpeed -= 15
            if (currentSpeed < 0) currentSpeed = 0
            println("Brakes applied. Current speed: $currentSpeed km/h.")
        } else {
            println("The vehicle is already fully stopped.")
        }
    }
}

class ElectricCar(val batteryCapacity: Int) : Vehicle() {
    // Satisfy the `Vehicle.fuelType` contract.
    // Override the abstract property is mandatory for subclasses.
    override val fuelType: String = "Electricity"

    // Implement `Vehicle.accelearte`.
    // Override the abstract method is mandatory for subclasses.
    override fun accelerate() {
        currentSpeed += 25
        println("Silent acceleration. Speed: $currentSpeed km/h.")
    }
}

class Motorcycle(val hasSideMirror: Boolean) : Vehicle() {
    // Satisfy the `Vehicle.fuelType` contract.
    override val fuelType: String = "Premium Gasoline"

    // Implement `Vehicle.accelerate`.
    override fun accelerate() {
        currentSpeed += 18
        println("Vroom. Speed: $currentSpeed km/h.")
    }
}

fun main() {
    println("Testing Electric Car...")
    val tesla = ElectricCar(batteryCapacity = 75)
    println("Fuel Source: ${tesla.fuelType}") // access overridden property
    println("Battery Pack: ${tesla.batteryCapacity} kWh") // access subclass-specific property
    tesla.accelerate() // invoke overridden method
    tesla.applyBrakes() // invoke the inherited concrete method

    println("Testing Motorcycle...")
    val harley = Motorcycle(hasSideMirror = false)
    println("Fuel Source: ${harley.fuelType}") // access overridden property
    harley.accelerate() // invoke overridden method
    harley.applyBrakes() // invoke the inherited concrete method
}