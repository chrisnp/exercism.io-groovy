class BankAccount {

    private boolean open
    int balance

    // You cannot do any operations before you open the account.
    // An account opens with a balance of 0
    // You can reopen an account
    void open() {
        balance = 0
        open = true
    }

    // you cannot do any operations after you close the account
    void close() {
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
    // you cannot withdraw more than the balance
    synchronized void withdraw(int amount) {
        if (!open) 
            throw new Exception("Account is closed")
        if (amount <= 0) 
            throw new Exception("Can't withdraw less than zero")
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