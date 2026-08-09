package objects

/**
 * Enum (short for enumeration)
 * Represents a fixed, read-only set of constants. It's best for representing choices that
 * never change, like weekdays, month names
 *
 * Naming convention:
 * In Kotlin, enum values are written in `UPPERCASE`. And enum class name is written in `PascalCase`
 *
 * Built-in properties every enum has:
 * 1. name: returns the exact string name of the constant.
 * 2. ordinal: returns the index number of the constant in the enum declaration
 */

enum class WeekDay { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

/**
 * Advanced Enum
 * Similar to Dart, Kotlin too supports the enum with a constructor
 */
enum class Month(var days: Int) {
    JANUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(31),
    SEPTEMBER(30),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31); // Semi-Colon (`;`) is mandatory for telling compiler that it's the end of values.

    fun getTotalDays(): Int = days
}

fun main() {
    val today = WeekDay.SUNDAY
    println(today.name)
    println(today.ordinal)

    val currentMonth = Month.AUGUST
    println(currentMonth.name)
    println(currentMonth.ordinal + 1)
    println(currentMonth.getTotalDays())
}