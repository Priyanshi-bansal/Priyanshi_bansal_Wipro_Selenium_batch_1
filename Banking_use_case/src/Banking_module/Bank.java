package Banking_module;

public class Bank {
private  int accountNumber;
private String accountHolder;
private double balance;

public Bank(int accountNumber, String accountHolder, double balance) {
	this.accountNumber = accountNumber;
	this.accountHolder = accountHolder;
	this.balance = balance;
}

public int getAccountNumber() {
	return accountNumber;
}

public String getAccountHolder() {
	return accountHolder;
}

public double getBalance() {
	return balance;
}

}
