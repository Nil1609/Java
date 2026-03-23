import java.util.Scanner;

// Parent Class
class BankAccount {

    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Setter
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Getter
    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited: " + amount);
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn: " + amount);
        } else {
            System.out.println("Invalid Withdrawal");
        }
    }

    // Method to override
    public void displayAccountType() {
        System.out.println("This is a normal bank account.");
    }
}


// Child Class (Inheritance)
class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor using super
    SavingsAccount(String name, double balance, double interestRate) {
        super(name, balance);  // calling parent constructor
        this.interestRate = interestRate;
    }

    // Method Overriding (Polymorphism)
    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest Added: " + interest);
    }
}



// Main Class
public class Comibined{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        System.out.print("Enter Interest Rate: ");
        double rate = sc.nextDouble();

        // Polymorphism
        BankAccount acc = new SavingsAccount(name, balance, rate);

        acc.displayAccountType();

        System.out.print("Enter Deposit Amount: ");
        double dep = sc.nextDouble();
        acc.deposit(dep);

        System.out.print("Enter Withdraw Amount: ");
        double wit = sc.nextDouble();
        acc.withdraw(wit);

        // Downcasting to access child method
        if (acc instanceof SavingsAccount) {
            ((SavingsAccount) acc).addInterest();
        }

        System.out.println("Final Balance: " + acc.getBalance());

        sc.close();
    }
}