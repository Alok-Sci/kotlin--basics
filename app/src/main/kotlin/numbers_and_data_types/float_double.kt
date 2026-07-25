package numbers_and_data_types

/**
 * FLOATING-POINT TYPES
 * Kotlin provides two built-in types for handling decimal numbers.
 */
fun main(){
    /**
     * 1. Float (32-bit single-precision floating-point)
     * Capacity: 6 to 7 decimal digits of precision.
     * Suffix requirement: Explicitly requires an 'f' or 'F' suffix.
     * Max Positive Value: ~3.4028235E38
     */
    val floatValue: Float = 80.2f

    /**
     * 2. Double (64-bit double-precision floating-point)
     * Capacity: 15 to 16 decimal digits of precision.
     * Suffix requirement: The default type for decimal literals; no suffix needed.
     * Max Positive Value: ~1.7976931348623157E308
     */
    val doubleValue: Double = 80.2

    println(floatValue)
    println(doubleValue)
}