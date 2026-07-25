package numbers_and_data_types

/**
 * ALTERNATIVE NUMERIC BASES (HEXADECIMAL & BINARY)
 * Kotlin natively supports representation of numbers in base-16 (Hexadecimal)
 * and base-2 (Binary) formats alongside standard base-10 (Decimal).
 */
fun main() {

    /**
     * HEXADECIMAL LITERALS (Base-16)
     * Suffix prefix: Must always start with '0x' or '0X'.
     * Valid characters: Digits 0-9 and letters A-F (case-insensitive).
     * Common usage: Defining color hex codes, memory addresses, or byte masks.
     */
    val blackColorHexValue = 0xFFFFF

    /**
     * BINARY LITERALS (Base-2)
     * Suffix prefix: Must always start with '0b' or '0B'.
     * Valid characters: Strictly digits '0' and '1'.
     * Common usage: Low-level bitwise operations, setting hardware flags, or bitmasks.
     */
    val binaryValue = 0b1010

    // Note: Printing these variables displays their default Base-10 (Decimal) value
    println(blackColorHexValue)
    println(binaryValue)
}