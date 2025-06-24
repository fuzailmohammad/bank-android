package com.example.bank

class BankAccount(val accountHolder: String, private var balance: Double) {

    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposited $$amount. New balance is $$balance.")
            transactionHistory.add("Deposited $$amount")
        } else {
            println("Deposit amount must be positive.")
        }
    }

    fun withdraw(amount: Double) {
        if (amount > 0 && amount <= balance) {
            balance -= amount
            println("Withdrew $$amount. New balance is $$balance.")
            transactionHistory.add("Withdrew $$amount")
        } else if (amount > balance) {
            println("Insufficient funds for withdrawal of $$amount.")
        } else {
            println("Withdrawal amount must be positive.")
        }
    }

    fun getTransactionHistory() {
        println("Transaction History for $accountHolder:")
        if (transactionHistory.isEmpty()) {
            println("No transactions made yet.")
        } else {
            transactionHistory.forEach { println(it) }
        }
    }

    fun getBalance(): Double {
        return balance
    }
}