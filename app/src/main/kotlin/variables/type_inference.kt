package variables

/*
 * Kotlin infers the type automatically
 */
fun main(){
    val name = "Alok Singh"; // String
    val age = 24 // Int
    val percentageInDiploma = 80.2 // Double
    val isMale = true // Boolean
    val favoriteAlphabet = 'A' // Char

    // We can print type of a variable by using varName::class.simpleName
    println(name::class.simpleName)
    println(age::class.simpleName)
    println(percentageInDiploma::class.simpleName)
    println(isMale::class.simpleName)
    println(favoriteAlphabet::class.simpleName)
}