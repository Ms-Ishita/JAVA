
abstract class BankAccount {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }


    public abstract void calculateInterest();


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}


class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

   
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest + ". New balance: " + balance);
    }
}


class CurrentAccount extends BankAccount {

   
    public CurrentAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }


   
    public void calculateInterest() {
        System.out.println("No interest is added for current accounts.");
    }
}

 
public class BankDemo {
    public static void main(String[] args) {
       
        SavingsAccount savings = new SavingsAccount("SA123", "Ishita Jain", 10000, 5);
        savings.deposit(2000);
        savings.calculateInterest();

        CurrentAccount current = new CurrentAccount("CA456", "Raj Malhotra", 15000);
        current.deposit(3000);
        current.calculateInterest();
    }
}
