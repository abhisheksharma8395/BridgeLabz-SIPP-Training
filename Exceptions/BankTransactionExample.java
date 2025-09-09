package Exceptions;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private double balance = 1000;
    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount < 0) throw new IllegalArgumentException("Invalid amount!");
        if (amount > balance) throw new InsufficientBalanceException("Insufficient balance!");
        balance -= amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransactionExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        try {
            account.withdraw(500);
            account.withdraw(2000);
            account.withdraw(-100);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
