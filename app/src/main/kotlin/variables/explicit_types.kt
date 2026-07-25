package variables

/*
 * Here we specify types explicitly/manually.
 *
 * Explicit type definition makes sense when
 * compiler doesn't know the what 'result' will hold
 */
fun main() {
    val name: String = "Alok Singh"
    val age: Int = 23
    val percentageInDiploma: Double = 80.2
    val isMale: Boolean = true
    val favoriteAlphabet: Char = 'A'

    // We can print type of a variable by using varName::class.simpleName
    println(name::class.simpleName)
    println(age::class.simpleName)
    println(percentageInDiploma::class.simpleName)
    println(isMale::class.simpleName)
    println(favoriteAlphabet::class.simpleName)
}