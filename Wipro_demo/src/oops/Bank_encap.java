package oops;
import java.util.Scanner;

public class Bank_encap {
	    private String accountHolder;
	    private int accountNumber;
	    private double balance;

	    public void setAccount(String name, int accNo, double initialBalance) {
	        accountHolder = name;
	        accountNumber = accNo;
	        balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println( amount + " deposited successfully.");
	        } else {
	            System.out.println("Deposit amount must be greater than zero.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Withdrawal amount must be greater than zero.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance. Withdrawal denied.");
	        } else {
	            balance -= amount;
	            System.out.println(amount + " withdrawn successfully.");
	        }
	    }

	    public void showBalance() {
	        System.out.println("Account Holder : " + accountHolder);
	        System.out.println("Account Number : " + accountNumber);
	        System.out.println("Current Balance: ₹" + balance);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Bank_encap account = new Bank_encap();

	        account.setAccount("Priyanshi Bansal", 987654321, 1000.0);

	        System.out.println("=== Welcome to the Bank ===");
	        account.showBalance();

	        System.out.print("\nEnter amount to deposit: ");
	        double depositAmt = sc.nextDouble();
	        account.deposit(depositAmt);
	        account.showBalance();

	        System.out.print("\nEnter amount to withdraw: ");
	        double withdrawAmt = sc.nextDouble();
	        account.withdraw(withdrawAmt);
	        account.showBalance();

	        sc.close();
	    }
	   
	}

