package abstract_ex;

import java.util.Scanner;

abstract class Vehicle {
 String name;

 Vehicle(String name) {
     this.name = name;
 }


 abstract void startEngine();
}


class Car extends Vehicle {
 Car(String name) {
     super(name);
 }


 void startEngine() {
     System.out.println(name + ": Car engine started with a key ignition.");
 }
}


class Bike extends Vehicle {
 Bike(String name) {
     super(name);
 }


 void startEngine() {
     System.out.println(name + ": Bike engine started with a kick or button.");
 }
}


class Truck extends Vehicle {
 Truck(String name) {
     super(name);
 }


 void startEngine() {
     System.out.println(name + ": Truck engine started with air pressure ignition.");
 }
}


public class VehicleDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Choose Vehicle Type:");
     System.out.println("1. Car\n2. Bike\n3. Truck");
     int choice = sc.nextInt();
     sc.nextLine();

     System.out.print("Enter Vehicle Name: ");
     String name = sc.nextLine();

     Vehicle vehicle;

     switch (choice) {
         case 1:
             vehicle = new Car(name);
             break;
         case 2:
             vehicle = new Bike(name);
             break;
         case 3:
             vehicle = new Truck(name);
             break;
         default:
             System.out.println("Invalid choice.");
             sc.close();
             return;
     }

     vehicle.startEngine();
     sc.close();
 }
}
