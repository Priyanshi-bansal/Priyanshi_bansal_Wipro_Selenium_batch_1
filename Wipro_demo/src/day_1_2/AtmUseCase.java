package day_1_2;
import java.util.Scanner;

class UserAccount {
    private int correctPin;
    private double balance;

    public UserAccount(int correctPin, double balance) {
        this.correctPin = correctPin;
        this.balance = balance;
    }

    public void validatePIN(int enteredPin) throws InvalidPinException {
        if (this.correctPin != enteredPin) {
            throw new InvalidPinException("Invalid PIN.");
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    public void deposit(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            balance += amount;
            System.out.println("Amount deposited successfully. New balance: " + balance);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Deposit Done.");
        }
    }

    public void withdraw(double amount) {
        try {
            if (amount <= 0) {
                throw new IllegalArgumentException("Amount must be greater than zero.");
            }
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient balance for this transaction.");
            }
            balance -= amount;
            System.out.println("Withdrawn successfully. Remaining balance: " + balance);
        } catch (IllegalArgumentException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Withdrawal Done.");
        }
    }
}

class InvalidPinException extends Exception {
    public InvalidPinException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class AtmUseCase {
    static UserAccount[] accounts = new UserAccount[3];
    static Scanner scanner = new Scanner(System.in);

    private static UserAccount findAccountByPin(int pin) {
        for (UserAccount acc : accounts) {
            try {
                acc.validatePIN(pin);
                return acc;
            } catch (InvalidPinException ignored) {
            }
        }
        return null;
    }

    public static void main(String[] args) {
        accounts[0] = new UserAccount(1234, 5000);
        accounts[1] = new UserAccount(4321, 7000);
        accounts[2] = new UserAccount(1111, 10000);

        System.out.println("Welcome to ATM System");

        int attempts = 0;
        UserAccount currentUser = null;

        while (attempts < 3 && currentUser == null) {
            System.out.print("Enter your PIN: ");
            int pin = scanner.nextInt();

            currentUser = findAccountByPin(pin);

            if (currentUser == null) {
                attempts++;
                System.out.println("Invalid PIN.");
                if (attempts == 3) {
                    System.out.println("Too many failed attempts. Card blocked.");
                    return;
                }
            } else {
                System.out.println("Login successful.");
            }

            System.out.println("Attempt logged.");
        }

        boolean sessionActive = true;
        while (sessionActive) {
            System.out.println("\n Choose an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    currentUser.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    currentUser.deposit(deposit);
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    currentUser.withdraw(withdraw);
                    break;
                case 4:
                    sessionActive = false;
                    System.out.println("Thank you! Don't forget to take your card.");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
