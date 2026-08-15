package exceptions

/**
 * Exception Handling (throw exception)
 * We can explicitly throw exceptions anywhere in the programs or applicaiton.
 *
 * `throw` keyword with specific exception type is used to throw exception,
 * so that it can be handled elsewhere.
 */

fun verifyOtp(otp: Int) {
    if (otp == 1111) {
        println("OTP is correct")
    } else {
        // throw an exception explicitly.
        throw IllegalArgumentException("OTP isn't correct")
    }
}

fun main() {
    // attempt to run this code
    try {
        println("Enter otp: ")
        verifyOtp(readln().toInt())

        // The program execution will reach this point only when the above statement doesn't throw an exception
        println("Login Successful")
    } catch (e: IllegalArgumentException) {
        // handle exception of type `IllegalArgumentException`
        println(e.message)
        println("Login Failed")
    }
}