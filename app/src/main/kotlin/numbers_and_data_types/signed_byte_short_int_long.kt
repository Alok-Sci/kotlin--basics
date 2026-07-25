package numbers_and_data_types

fun main(){
    // Different signed integer sizes

    /**
     * SIGNED INTEGER TYPES
     * Kotlin provides four built-in signed integer types with fixed memory sizes.
     * Each type uses a portion of its bits for the numeric value and 1 bit for the +/- sign.
     */

    /**
     * 1. Byte (8-bit signed integer)
     * Capacity range: -128 to 127
     */
    var byteIntegerValue: Byte = 127
    byteIntegerValue = -127

    /**
     * 2. Short (16-bit signed integer)
     * Capacity range: -32,768 to 32,767
     */
    var shortIntegerValue: Short = 32767
    shortIntegerValue = -32768

    /**
     * 3. Int (32-bit signed integer)
     * Capacity range: -2,147,483,648 to 2,147,483,647 (~2 Billion)
     * Note: Underscores can be used as visual separators for readability.
     */
    var integerValue: Int = 2147483647
    integerValue = -2147483648

    /**
     * 4. Long (64-bit signed integer)
     * Capacity range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (~9 Quintillion)
     * Note: Requires the 'L' suffix to explicitly denote a Long literal.
     */
    var longIntegerValue: Long = 9223372036854775807L
    longIntegerValue = -9223372036854775807L

    println(byteIntegerValue::class.simpleName)
    println(shortIntegerValue::class.simpleName)
    println(integerValue::class.simpleName)
    println(longIntegerValue::class.simpleName)
}