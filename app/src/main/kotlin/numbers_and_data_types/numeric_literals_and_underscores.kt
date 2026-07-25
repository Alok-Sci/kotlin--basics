package numbers_and_data_types

/**
 * NUMERIC LITERALS & UNDERSCORE SEPARATORS
 * Kotlin allows us to use underscores (`_`) within numeric literals to group digits.
 */
fun main(){
    /**
     * Large numbers can be difficult to scan at a glance.
     * Underscores act as visual breaks, much like commas (,) do in written language.
     */
    val number: ULong = 18_446_744_073_709_551_615uL
    val currentCtc: UInt = 2_16_000U

    println(number)
    println(currentCtc)
}