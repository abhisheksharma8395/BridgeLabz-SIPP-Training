package JavaClassAndObject;

class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: ₹" + balance);
    }
}

public class ATMSimulator {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "Priya Singh";
        account.accountNumber = "AC10245";
        account.balance = 5000;

        account.deposit(1500);
        account.withdraw(2000);
        account.withdraw(6000); // Should show insufficient balance
        account.display();
    }
}
