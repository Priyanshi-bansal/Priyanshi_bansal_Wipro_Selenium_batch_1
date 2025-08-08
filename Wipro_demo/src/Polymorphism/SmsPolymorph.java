package Polymorphism;

class Notification {
    void send() {
        System.out.println("Sending a generic notification.");
    }
}

class EmailNotification extends Notification {
    void send() {
        System.out.println("Sending Email Notification.");
    }
}

class SMSNotification extends Notification {
    void send() {
        System.out.println("Sending SMS Notification.");
    }
}

public class SmsPolymorph {
    public static void main(String[] args) {
        

    	Notification n1 = new EmailNotification(); 
        n1.send();  

        Notification n2 = new SMSNotification();   
        n2.send(); 
    }
}

