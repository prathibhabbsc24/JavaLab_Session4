// Abstract base class
abstract class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract method
    abstract void calculateInterest();

    // Display account details
    public void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

// Derived class: SavingsAccount
class SavingsAccount extends Account {
    private double interestRate = 0.04; // 4%

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * interestRate;
        System.out.println("Savings Account Interest: ₹" + interest);
    }
}

// Derived class: CurrentAccount
class CurrentAccount extends Account {
    private double serviceCharge = 100.0;

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    void calculateInterest() {
        System.out.println("Current Account has no interest. Service charge: ₹" + serviceCharge);
    }
}

// Main class (must match file name)
public class BankDemo {
    public static void main(String[] args) {
        Account acc1 = new SavingsAccount("Sam", 50000);
        Account acc2 = new CurrentAccount("Raj", 30000);

        acc1.displayDetails();
        acc1.calculateInterest();

        System.out.println();

        acc2.displayDetails();
        acc2.calculateInterest();
    }
}
