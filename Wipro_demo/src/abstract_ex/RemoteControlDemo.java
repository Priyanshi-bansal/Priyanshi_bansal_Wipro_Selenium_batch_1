package abstract_ex;

import java.util.Scanner;


abstract class Remote {
 String deviceName;

 Remote(String deviceName) {
     this.deviceName = deviceName;
 }

 abstract void turnOn();
 abstract void turnOff();
}


class TVRemote extends Remote {
 TVRemote(String name) {
     super(name);
 }

 void turnOn() {
     System.out.println(deviceName + " TV is now ON.");
 }


 void turnOff() {
     System.out.println(deviceName + " TV is now OFF.");
 }
}


class ACRemote extends Remote {
 ACRemote(String name) {
     super(name);
 }


 void turnOn() {
     System.out.println(deviceName + " AC is now ON.");
 }


 void turnOff() {
     System.out.println(deviceName + " AC is now OFF.");
 }
}


class FanRemote extends Remote {
 FanRemote(String name) {
     super(name);
 }


 void turnOn() {
     System.out.println(deviceName + " Fan is now ON.");
 }


 void turnOff() {
     System.out.println(deviceName + " Fan is now OFF.");
 }
}


public class RemoteControlDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Select Device to Control:");
     System.out.println("1. TV\n2. AC\n3. Fan");
     int choice = sc.nextInt();
     sc.nextLine();

     System.out.print("Enter Device Name: ");
     String name = sc.nextLine();

     Remote remote;

     switch (choice) {
         case 1:
             remote = new TVRemote(name);
             break;
         case 2:
             remote = new ACRemote(name);
             break;
         case 3:
             remote = new FanRemote(name);
             break;
         default:
             System.out.println("Invalid option.");
             sc.close();
             return;
     }

     remote.turnOn();
     remote.turnOff();

     sc.close();
 }
}
