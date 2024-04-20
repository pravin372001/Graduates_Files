package bank;

public class Bank {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount account = new BankAccount("123456789", 1000.0);

        // Create a bank customer
        BankCustomer customer = new BankCustomer("Pravin", account);

        // Test deposit and withdraw
        try {
            System.out.println("Customer " + customer.getName());
            System.out.println("Initial Balance: " + account.getBalance());
            account.deposit(500.0);
            account.withdraw(1000.0);
            account.withdraw(1500.0); // Should throw InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
