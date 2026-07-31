package strings

/**
 * String Length and Indexing
 * string is just an array of character, therefore it's characters can be accessed
 * using specific index numbers using the same syntax which is used to access the array elements.
 */

fun main() {
    println("Tell us your name:")
    val name = readln()
    val nameWordList = name.split(" ")
    val nameWordCount = nameWordList.count()

    val firstName = nameWordList[0]
    val lastName: String? = when (nameWordCount) {
        2 -> nameWordList[1]
        3 -> nameWordList[2]
        4 -> nameWordList[3]
        else -> null
    }

    // Extract the first letter of both firstname and lastname and then merge them
    val nickName = "${firstName[0]}${if (lastName != null) lastName[0] else ""}"

    println("Your username is $nickName")
}