package abstract_ex;

import java.util.Scanner;

abstract class Notification {
 String recipient;
 String message;

 Notification(String recipient, String message) {
     this.recipient = recipient;
     this.message = message;
 }

 abstract void send();
}


class EmailNotification extends Notification {
 EmailNotification(String recipient, String message) {
     super(recipient, message);
 }

 
 void send() {
     System.out.println("Sending Email to: " + recipient);
     System.out.println("Message: " + message);
 }
}


class SMSNotification extends Notification {
 SMSNotification(String recipient, String message) {
     super(recipient, message);
 }


 void send() {
     System.out.println("Sending SMS to: " + recipient);
     System.out.println("Message: " + message);
 }
}


class PushNotification extends Notification {
 PushNotification(String recipient, String message) {
     super(recipient, message);
 }


 void send() {
     System.out.println("Sending Push Notification to: " + recipient);
     System.out.println("Message: " + message);
 }
}


public class NotificationSystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Choose Notification Type:");
     System.out.println("1. Email\n2. SMS\n3. Push Notification");
     int choice = sc.nextInt();
     sc.nextLine();

     System.out.print("Enter Recipient: ");
     String recipient = sc.nextLine();

     System.out.print("Enter Message: ");
     String message = sc.nextLine();

     Notification notification;

     switch (choice) {
         case 1:
             notification = new EmailNotification(recipient, message);
             break;
         case 2:
             notification = new SMSNotification(recipient, message);
             break;
         case 3:
             notification = new PushNotification(recipient, message);
             break;
         default:
             System.out.println("Invalid choice.");
             sc.close();
             return;
     }

     notification.send();
     sc.close();
 }
}

