package Inheritance;

class Vehicle {
 String name;
 int speed;

 Vehicle(String name, int speed) {
     this.name = name;
     this.speed = speed;
 }

 public void start() {
     System.out.println(name + " is starting.");
 }

 public void stop() {
     System.out.println(name + " is stopping.");
 }

 public void displayInfo() {
     System.out.println("Vehicle: " + name);
     System.out.println("Speed  : " + speed + " km/h");
 }
}


class Car extends Vehicle {
 int doors;

 Car(String name, int speed, int doors) {
     super(name, speed);
     this.doors = doors;
 }

 public void openTrunk() {
     System.out.println(name + "'s trunk is open.");
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Doors  : " + doors);
 }
}


class Bike extends Vehicle {
 boolean hasCarrier;

 Bike(String name, int speed, boolean hasCarrier) {
     super(name, speed);
     this.hasCarrier = hasCarrier;
 }

 public void doWheelie() {
     System.out.println(name + " is doing a wheelie!");
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Carrier: " + (hasCarrier ? "Yes" : "No"));
 }
}


class Truck extends Vehicle {
 int loadCapacity; 

 Truck(String name, int speed, int loadCapacity) {
     super(name, speed);
     this.loadCapacity = loadCapacity;
 }

 public void loadCargo() {
     System.out.println(name + " is loading cargo.");
 }

 @Override
 public void displayInfo() {
     super.displayInfo();
     System.out.println("Load Capacity: " + loadCapacity + " kg");
 }
}


public class VehicleTest {
 public static void main(String[] args) {
     Car myCar = new Car("Honda City", 120, 4);
     Bike myBike = new Bike("Yamaha FZ", 95, true);
     Truck myTruck = new Truck("Tata Truck", 80, 5000);

     System.out.println("=== Car Details ===");
     myCar.displayInfo();
     myCar.start();
     myCar.openTrunk();
     myCar.stop();

     System.out.println("\n=== Bike Details ===");
     myBike.displayInfo();
     myBike.start();
     myBike.doWheelie();
     myBike.stop();

     System.out.println("\n=== Truck Details ===");
     myTruck.displayInfo();
     myTruck.start();
     myTruck.loadCargo();
     myTruck.stop();
 }
}
