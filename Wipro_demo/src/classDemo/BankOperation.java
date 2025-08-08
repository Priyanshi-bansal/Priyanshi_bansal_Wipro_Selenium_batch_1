package classDemo;

public class BankOperation {
    String accountHolderName;
    int accountNumber;
    double balance;

    void setAccountDetails(String name, int accNumber, double initialBalance) {
        accountHolderName = name;
        accountNumber = accNumber;
        balance = initialBalance;
    }


    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void showBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }


    public static void main(String[] args) {

        BankOperation account = new BankOperation();

        account.setAccountDetails("Priyanshi Bansal", 12345678, 1000.0);

 
        account.showBalance();
        account.deposit(500);
        account.withdraw(200);
        account.withdraw(1500); 
        account.showBalance();
    }
}

