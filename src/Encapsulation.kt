// ==== Encapsulation Example ====

class BankAccount {

    // Private property: balance can't be accessed directly from outside this class
    private var balance: Int = 1000

    // Public method to deposit money into the account
    fun deposit(amount: Int) {
        // Check if current balance is greater than 0 (optional logic)
        if (balance > 0) {
            balance += amount // Increase the balance
            println("Deposited $amount. New balance is: $balance")
        }
    }

    // Public method to withdraw money from the account
    fun withdraw(amount: Int) {
        // Only withdraw if the amount is less than or equal to current balance
        if (amount <= balance) {
            balance -= amount // Decrease the balance
            println("Withdrew $amount. New balance is: $balance")
        } else {
            println("Insufficient balance") // Not enough money to withdraw
        }
    }

    // Public method to get the current balance
    fun getBlance(): Int {
        return balance // Return the current balance
    }
}

fun main() {
    val account = BankAccount() // Create a new BankAccount object

    account.deposit(amount = 500)     // Add 500 to balance
    account.withdraw(amount = 200)    // Withdraw 200 from balance

    // Print the current balance
    println("Current balance: ${account.getBlance()}")

    // account.balance = 10000 // ❌ Error: balance is private and can't be accessed directly (Encapsulation)
}
