package strings

/**
 * String (multiline)
 * In Kotlin, we can use multiline strings using `"""` (triple quotes)
 */

fun main(){
    val intro = """
        My name is Alok Singh.
        I am a Flutter Developer with over 2 years of production and industry experience,
        in developing applications for clients across America, Japan, Timor-Leste, 
        Malaysia, Bangalore, and Hyderabad.
        Currently I am learning Kotlin for Android Development, so that I can soon be able to create packages,
        and be able to understand the native code and work with it during flutter development
    """.trimIndent()

    println(intro)
}