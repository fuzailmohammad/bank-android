package com.example.bank

fun main() {
    val account = BankAccount("John Doe", 1000.0)

    println("Initial balance: \$${account.getBalance()}")

    account.deposit(500.0)
    account.withdraw(200.0)
    val money = readln()
    account.deposit(money.toDoubleOrNull() ?: 0.0) // Handle invalid input gracefully
    account.withdraw(1500.0) // Attempt to withdraw more than balance
    account.deposit(-50.0) // Attempt to deposit a negative amount

    account.getTransactionHistory()
    println("Final balance: \$${account.getBalance()}")
}