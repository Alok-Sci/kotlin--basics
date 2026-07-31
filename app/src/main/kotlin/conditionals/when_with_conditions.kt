package conditionals

import kotlin.math.absoluteValue

/**
 * When Conditional (with condition)
 * It also supports evaluating conditions and based on that perform some operation
 */

fun main(){
  println("Enter a number: ")
  val number = readln().toInt()

  when {
    number % 2 == 0 -> println("even")
    number % 2 == 1 -> println("odd")
    number == 0 -> println("even")
    number.absoluteValue < 0 && number.absoluteValue % 2 == 0 -> {
      println("even")
    }
    number.absoluteValue < 0 && number.absoluteValue % 2 != 0 -> {
      println("odd")
    }
    else -> println("Invalid number")
  }
}