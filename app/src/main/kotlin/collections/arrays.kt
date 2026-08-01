package collections

/**
 * Array
 * It is a sequential data structure which holds a fixed number of values of same type.
 * In Kotlin, we can define an array using `arrayOf()` class.
 *
 * Note: Arrays and Lists are not the same.
 * Arrays have strictly fixed size.
 * Lists (MutableList) can have dynamic size.
 *
 * Specialized Classes to use optimized, and unboxed primitive types:
 * byteArrayOf()
 * shortArrayOf()
 * intArrayOf()
 * longArrayOf()
 * ubyteArrayOf()
 * ushortArrayOf()
 * uintArrayOf()
 * ulongArrayOf()
 * booleanArrayOf()
 * charArrayOf()
 * doubleArrayOf()
 * floatArrayOf()
 */

fun main() {
    val arr = arrayOf("Alok", "Suresh", "Surendra")
    val intArr = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val booleanArr = booleanArrayOf(true, false, false, true, false, false)
    val charArr = charArrayOf('a', 'b', 'c')
    val doubleArr = doubleArrayOf(43.4, 34.43, 45.0)
    val floatArr = floatArrayOf(2.3f, 3.4f)
    val byteArr = byteArrayOf(123, 21, 34, 23)
    val shortArr = shortArrayOf(24535, 3433, 2243, 23423)
    val longArr = longArrayOf(2342345L, 2234L, 234254L, 2352L)
    val uByteArr = ubyteArrayOf(10u, 245U, 235u, 235u)
    val uShortArr = ushortArrayOf(3453u, 2455U, 2355U, 23562U)
    val uIntArr = uintArrayOf(235435U, 224526U, 2362644U, 2624243U)
    val uLongArr = ulongArrayOf(2354435uL, 67564534UL, 2678686865886UL, 67868686575858UL)

    println(arr.joinToString(separator = "|", prefix = "[", postfix = "]"))
    println(intArr.joinToString())
    println(booleanArr.joinToString())
    println(charArr.joinToString())
    println(doubleArr.joinToString())
    println(floatArr.joinToString())
    println(byteArr.joinToString())
    println(shortArr.joinToString())
    println(longArr.joinToString())
    println(uByteArr.joinToString())
    println(uShortArr.joinToString())
    println(uIntArr.joinToString())
    println(uLongArr.joinToString())
}
