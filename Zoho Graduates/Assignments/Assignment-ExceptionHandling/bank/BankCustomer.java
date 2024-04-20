package bank;

class BankCustomer {
    private String name;
    private BankAccount account;

    public BankCustomer(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
}