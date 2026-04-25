class Account {
    private int pin = 1234;
    private double balance = 1000;

    boolean verifyPin(int inputPin) {
        return this.pin == inputPin;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
}