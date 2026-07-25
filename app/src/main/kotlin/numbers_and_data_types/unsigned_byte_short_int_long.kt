package numbers_and_data_types

fun main(){
    /**
     * UNSIGNED INTEGER TYPES
     * These types do not store negative numbers. Because the sign bit is freed up,
     * their maximum positive capacity is exactly double that of their signed counterparts.
     * Note: Literal values require the 'u/U' suffix (and 'uL/UL' for ULong).
     */

    /**
     * 1. UByte (8-bit unsigned)
     * Range: 0 to 255
     */
    val unsignedByteInteger: UByte = 255u

    /**
     * 2. UShort (16-bit unsigned)
     * Range: 0 to 65,535
     */
    val unsignedShortInteger: UShort = 65535u

    /**
     * 3. UInt (32-bit unsigned)
     * Range: 0 to 4,294,967,295 (~4.2 Billion)
     */
    val unsignedInteger: UInt = 4294967295U

    /**
     * 4. ULong (64-bit unsigned)
     * Range: 0 to 18,446,744,073,709,551,615 (~18 Quintillion)
     */
    val unsignedLongInteger: ULong = 18446744073709551615uL

    // Unsigned Types
    println(unsignedByteInteger::class.simpleName)
    println(unsignedShortInteger::class.simpleName)
    println(unsignedInteger::class.simpleName)
    println(unsignedLongInteger::class.simpleName)
}