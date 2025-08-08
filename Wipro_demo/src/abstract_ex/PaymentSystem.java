package abstract_ex;

import java.util.Scanner;

abstract class Payment {
 double amount;

 Payment(double amount) {
     this.amount = amount;
 }

 abstract void pay();
}


class CreditCardPayment extends Payment {
 String cardNumber;

 CreditCardPayment(double amount, String cardNumber) {
     super(amount);
     this.cardNumber = cardNumber;
 }

 
 void pay() {
     System.out.println("Paid ₹" + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
 }
}

class UPIPayment extends Payment {
 String upiId;

 UPIPayment(double amount, String upiId) {
     super(amount);
     this.upiId = upiId;
 }

 void pay() {
     System.out.println("Paid ₹" + amount + " using UPI ID: " + upiId);
 }
}

class CashPayment extends Payment {
 CashPayment(double amount) {
     super(amount);
 }


 void pay() {
     System.out.println("Paid ₹" + amount + " in Cash.");
 }
}

public class PaymentSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter amount to pay: ₹");
     double amount = sc.nextDouble();
     sc.nextLine();

     System.out.println("Choose payment method: 1. Credit Card  2. UPI  3. Cash");
     int choice = sc.nextInt();
     sc.nextLine();

     Payment payment = null;

     switch (choice) {
         case 1:
             System.out.print("Enter Credit Card Number: ");
             String card = sc.nextLine();
             payment = new CreditCardPayment(amount, card);
             break;
         case 2:
             System.out.print("Enter UPI ID: ");
             String upi = sc.nextLine();
             payment = new UPIPayment(amount, upi);
             break;
         case 3:
             payment = new CashPayment(amount);
             break;
         default:
             System.out.println("Invalid choice.");
             System.exit(0);
     }

     payment.pay();
     sc.close();
 }
}

