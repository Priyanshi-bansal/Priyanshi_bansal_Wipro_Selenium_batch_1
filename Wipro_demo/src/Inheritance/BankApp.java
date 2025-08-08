package Inheritance;

class Account {
 protected String accountNumber;
 protected double balance;

 public Account(String accNumber, double balance) {
     this.accountNumber = accNumber;
     this.balance = balance;
 }

 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited ₹" + amount + ". New balance: ₹" + balance);
 }

 public void display() {
     System.out.println("Account Number: " + accountNumber);
     System.out.println("Balance: ₹" + balance);
 }
}

class SavingsAccount extends Account {
 private double interestRate;

 public SavingsAccount(String accNumber, double balance, double interestRate) {
     super(accNumber, balance);
     this.interestRate = interestRate;
 }

 public void addInterest() {
     double interest = balance * interestRate / 100;
     balance += interest;
     System.out.println("Interest added: ₹" + interest);
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Account Type: Savings");
     System.out.println("Interest Rate: " + interestRate + "%");
 }
}


class CurrentAccount extends Account {
 private double overdraftLimit;

 public CurrentAccount(String accNumber, double balance, double overdraftLimit) {
     super(accNumber, balance);
     this.overdraftLimit = overdraftLimit;
 }

 public void withdraw(double amount) {
     if (balance + overdraftLimit >= amount) {
         balance -= amount;
         System.out.println("Withdrawn ₹" + amount + ". New balance: ₹" + balance);
     } else {
         System.out.println("Withdrawal denied! Overdraft limit exceeded.");
     }
 }

 @Override
 public void display() {
     super.display();
     System.out.println("Account Type: Current");
     System.out.println("Overdraft Limit: ₹" + overdraftLimit);
 }
}


public class BankApp {
 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount("SAV123", 5000, 4);
     CurrentAccount ca = new CurrentAccount("CUR456", 10000, 3000);

     System.out.println("=== Savings Account ===");
     sa.display();
     sa.addInterest();
     sa.deposit(1500);
     sa.display();

     System.out.println("\n=== Current Account ===");
     ca.display();
     ca.withdraw(12000);
     ca.withdraw(1500); 
     ca.display();
 }
}

