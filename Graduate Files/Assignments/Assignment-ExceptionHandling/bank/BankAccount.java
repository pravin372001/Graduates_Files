package bank;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful. New Balance: " + balance);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Unable to withdraw. Available balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        }
    }
}