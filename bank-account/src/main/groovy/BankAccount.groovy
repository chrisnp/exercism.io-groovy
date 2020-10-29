class BankAccount {

    private boolean open
    int balance

    private static final String ERR_NOT_CLOSED = 
            "Account is closed"
    private static final String ERR_NOT_NEG = 
            "Don't be silly"
    private static final String ERR_EXCEEDS = 
            "Amount requested exceeds balance"

    private void ifNotClosed() {
        if (!open)
            throw new Exception(ERR_NOT_CLOSED)
    }

    private void andNotNegative(amount) {
        if (amount < 0)
            throw new Exception(ERR_NOT_NEG)
    }

    private void andAlsoReasonable(amount) {
        if (amount > balance) 
            throw new Exception(ERR_EXCEEDS)
    }

    // You cannot do any operations before you open 
    // the account.
    // An account opens with a balance of 0
    // You can reopen an account
    void open() {
        balance = 0
        open = true
    }

    // you cannot do any operations after you close 
    // the account
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