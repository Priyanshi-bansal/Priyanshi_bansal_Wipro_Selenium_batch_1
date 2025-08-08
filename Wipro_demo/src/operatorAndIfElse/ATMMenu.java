package operatorAndIfElse;

public class ATMMenu {
    public static void main(String[] args) {
        int choice = 2;
        double balance = 5000;

        switch (choice) {
            case 1:
                System.out.println("Balance: ₹" + balance);
                break;
            case 2:
                double withdraw = 2000;
                if (withdraw <= balance) {
                    balance -= withdraw;
                    System.out.println("Withdrawn: ₹" + withdraw);
                    System.out.println("Remaining: ₹" + balance);
                } else {
                    System.out.println("Insufficient funds");
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}

