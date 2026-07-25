package numbers_and_data_types

/**
 * TYPE CONVERSION NUMBERS
 * Kotlin provides a list of helper methods to type cast a value to another type.
 */
fun main(){
    val intValue = 10
    val intToDouble = intValue.toDouble()
    val intToFloat = intValue.toFloat()
    val intToString = intValue.toString()
    val intToByte = intValue.toByte()
    val intToShort = intValue.toShort()
    val intToLong = intValue.toLong()
    val intToChar = intValue.toChar()
    val intToHex = intValue.toHexString()
    val intToUByte = intValue.toUByte()
    val intToUShort = intValue.toUShort()
    val intToULong = intValue.toULong()
    val intToUInt = intValue.toUInt()
    val intToBigInteger = intValue.toBigInteger()
    val intToBigDecimal = intValue.toBigDecimal()

    println(intValue)
    println(intToDouble)
    println(intToFloat)
    println(intToString)
    println(intToByte)
    println(intToShort)
    println(intToLong)
    println(intToChar)
    println(intToHex)
    println(intToUByte)
    println(intToUShort)
    println(intToULong)
    println(intToUInt)
    println(intToBigInteger)
    println(intToBigDecimal)

    println(intValue::class.simpleName)
    println(intToDouble::class.simpleName)
    println(intToFloat::class.simpleName)
    println(intToString::class.simpleName)
    println(intToByte::class.simpleName)
    println(intToShort::class.simpleName)
    println(intToLong::class.simpleName)
    println(intToChar::class.simpleName)
    println(intToHex::class.simpleName)
    println(intToUByte::class.simpleName)
    println(intToUShort::class.simpleName)
    println(intToULong::class.simpleName)
    println(intToUInt::class.simpleName)
    println(intToBigInteger::class.simpleName)
    println(intToBigDecimal::class.simpleName)
}