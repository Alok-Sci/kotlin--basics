package exceptions

import java.io.FileNotFoundException

/**
 * Exception Handling (custom exceptions)
 * In Kotlin, we can create custom exceptions by inheriting the `Exception` class.
 */

class InsufficientFundsException(message: String) : Exception(message)
class IllegalAmountException(val enteredAmount: Double) : Exception("Please enter a valid amount") {
    // we can have helper class members in custom exceptions
    fun printReport() {
        println("[Log]: You have entered an illegal amount ($enteredAmount).")
    }
}

class BankAccount(val accountNumber: String, val accountHolderName: String) {
    var balance: Double = 0.0

    constructor(accountNumber: String, accountHolderName: String, initialBalance: Double) : this(
        accountNumber,
        accountHolderName,
    ) {
        this.balance = initialBalance
    }

    fun deposit(amount: Double) {
        if (amount > 0) balance += amount else throw IllegalAmountException(amount)
    }

    fun withdraw(amount: Double) {
        if (amount > balance) throw InsufficientFundsException("You are short of money, current balance is $balance")
        if (amount > 0) balance -= amount else throw IllegalAmountException(amount)
    }
}

fun main() {
    println("---Welcome to Axis Bank---")
    println("Create an account by filling the following details:")

    val account = BankAccount(
        "1232",
        "Alok Singh",
        2160.0,
    )

    try {
        println("Enter the amount to deposit: ")
        val amountToDeposit = readln().toDouble() ?: 0.0
        account.deposit(amountToDeposit)
        println("Enter the amount to withdraw: ")
        val amountToWithdraw = readln().toDouble() ?: 0.0
        account.withdraw(amountToWithdraw)
    }
    /**
     * We can have multiple catch blocks for a single try black.
     */
    // Handling specific exceptions
    catch (e: IllegalAmountException) {
        // invoke custom exception's helper method
        e.printReport()
    } catch (e: InsufficientFundsException) {
        println(e.message)
    }
    // Other exceptions
    catch (e: Exception){
        println("An unexpected error occurred: ${e.message}")
    }
}