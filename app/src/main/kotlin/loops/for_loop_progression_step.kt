package loops

/**
 * For Loop (with progression step)
 * It also supports `step` keyword to skip the iteration for `step` times
 */

fun main() {
    println("Enter a number: ")
    val number = readln().toInt()

    print("\nDescending with skip 2: ")
    for (i in number downTo 1 step 2) {
        print("$i ")
    }

    print("\nAscending with skip 3: ")
    for (i in 0 until number step 3) {
        print("$i ")
    }

}