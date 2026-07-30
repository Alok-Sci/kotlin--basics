package operators

/**
 * Assignment Operators
 * These operators are used to assign a value to the variable on the left.
 *
 * = (assigns a value to the variable)
 *
 * Kotlin supports various assignment operator
 * including the ones which are kind of shortcut to do two operations at once,
 * these operators are known as Augmented Assignment Operators.
 * += (shortcut to {var = var + value})
 * -= (shortcut to {var = var - value})
 * *= (shortcut to {var = var * value})
 * /= (shortcut to {var = var / value})
 * %= (shortcut to {var = var % value})
 *
 */
fun main(){
    var number = 20
    println(number)
    number += 30
    println(number)
    number -= 10
    println(number)
    number *= 34
    println(number)
    number /= 21
    println(number)
    number %= 3
    println(number)
}