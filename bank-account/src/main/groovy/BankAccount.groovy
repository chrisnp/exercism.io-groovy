class BankAccount {

    private boolean open
    int balance

    private void ifNotClosed() {
        if (!open)
            throw new Exception("Account is closed")
    }

    private void andNotNegative(amount) {
        if (amount < 0)
            throw new Exception("Don't be silly")
    }

    private void andAlsoReasonable(amount) {
        if (amount > balance) 
            throw new Exception("Amount requested exceeds balance")
    }

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

    // you cannot deposit into a closed account
    // you cannot deposit a negative amount 
    synchronized void deposit(int amount) {
        ifNotClosed()
        andNotNegative(amount)
        balance += amount
    }

    // you cannot withdraw into a closed account
    // you cannot withdraw a negative amount 
    // you cannot withdraw more than the balance
    synchronized void withdraw(int amount) {
        ifNotClosed()
        andNotNegative(amount) 
        andAlsoReasonable(amount)
        balance -= amount
    }

    // returns the current balance
    synchronized int getBalance() {
        ifNotClosed()
        balance
    }
}