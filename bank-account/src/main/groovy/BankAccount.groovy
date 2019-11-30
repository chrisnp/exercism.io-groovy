class BankAccount {

    boolean open = false
    int balance = 0


    // You cannot do any operations before you open the account.
    // An account opens with a balance of 0
    // You can reopen an account
    synchronized void open() {
        open = true
    }

    // you cannot do any operations after you close the account
    synchronized void close() {
        open = false
    }

    // this should increment the balance
    // you cannot deposit into a closed account
    // you cannot deposit a negative amount 
    synchronized void deposit(int amount) {
        if (!open) 
            throw new Exception("Account is closed")
        if (amount < 0) 
            throw new Exception("Negative deposit")
        balance += amount 
    }

    // this should decrement the balance
    // you cannot withdraw into a closed account
    // you cannot withdraw a negative amount 
    synchronized void withdraw(int amount) {
        if (!open) 
            throw new Exception("Account is closed")
        if (amount < 0) 
            throw new Exception("Negative withdrawal")
        if (amount > balance) 
            throw new Exception("Amount requested exceeds balance")
        balance -= amount

    }

    // returns the current balance
    synchronized int getBalance() {
        if (!open) 
            throw new Exception("Account is closed")
        return balance
    }

}