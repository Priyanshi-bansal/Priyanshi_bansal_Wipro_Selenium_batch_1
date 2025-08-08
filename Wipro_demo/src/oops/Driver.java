package oops;

import java.util.Scanner;

class Car {

    private boolean engineStatus;
    private int speed;
    private double fuelLevel;

    public boolean isEngineOn() {
        return engineStatus;
    }

    public void setEngineStatus(boolean status) {
        if (status && fuelLevel > 0) {
            engineStatus = true;
            System.out.println("Engine started.");
        } else if (!status) {
            engineStatus = false;
            speed = 0;
            System.out.println("Engine stopped.");
        } else {
            System.out.println("Cannot start engine. Fuel is empty.");
        }
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        if (!engineStatus) {
            System.out.println("Can't set speed. Engine is OFF.");
        } else if (fuelLevel <= 0) {
            System.out.println("Can't drive. Fuel is empty.");
        } else if (newSpeed >= 0) {
            speed = newSpeed;
            fuelLevel -= newSpeed * 0.01;
            System.out.println("Speed set to " + speed + " km/h");
        } else {
            System.out.println("Speed cannot be negative.");
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuel) {
        if (fuel >= 0) {
            fuelLevel = fuel;
            System.out.println("Fuel level set to " + fuelLevel + " liters.");
        } else {
            System.out.println("Fuel level cannot be negative.");
        }
    }

    public void showStatus() {
        System.out.println("\n=== Car Status ===");
        System.out.println("Engine        : " + (engineStatus ? "ON" : "OFF"));
        System.out.println("Speed         : " + speed + " km/h");
        System.out.println("Fuel Remaining: " + fuelLevel + " liters");
        System.out.println("===================");
    }
}

public class Driver {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car();

        System.out.print("Enter fuel amount (liters): ");
        double fuel = sc.nextDouble();
        myCar.setFuelLevel(fuel);

        System.out.print("Do you want to start the engine? (true/false): ");
        boolean engineStart = sc.nextBoolean();
        myCar.setEngineStatus(engineStart);

        System.out.print("Enter speed to set (km/h): ");
        int speed = sc.nextInt();
        myCar.setSpeed(speed);

        myCar.showStatus();

        System.out.print("\nDo you want to stop the engine? (true/false): ");
        boolean engineStop = sc.nextBoolean();
        if (engineStop == true) {
            myCar.setEngineStatus(false);
        }

        myCar.showStatus();

        sc.close();
    }
}



//import java.util.Scanner;
//
//public class car {
//	
//    private boolean engineStatus; 
//    private int speed;         
//    private double fuelLevel;  
//
//    public boolean isEngineOn() {
//        return engineStatus;
//    }
//
//    public void setEngineStatus(boolean status) {
//        if (status && fuelLevel > 0) {
//            engineStatus = true;
//            System.out.println("Engine started.");
//        } else if (!status) {
//            engineStatus = false;
//            speed = 0;
//            System.out.println("Engine stopped.");
//        } else {
//            System.out.println("Cannot start engine. Fuel is empty.");
//        }
//    }
//
//
//    public int getSpeed() {
//        return speed;
//    }
//
//    public void setSpeed(int newSpeed) {
//        if (!engineStatus) {
//            System.out.println("Can't set speed. Engine is OFF.");
//        } else if (fuelLevel <= 0) {
//            System.out.println("Can't drive. Fuel is empty.");
//        } else if (newSpeed >= 0) {
//            speed = newSpeed;
//            fuelLevel -= newSpeed * 0.01;
//            System.out.println("🚗 Speed set to " + speed + " km/h");
//        } else {
//            System.out.println("Speed cannot be negative.");
//        }
//    }
//
//    public double getFuelLevel() {
//        return fuelLevel;
//    }
//
//    public void setFuelLevel(double fuel) {
//        if (fuel >= 0) {
//            fuelLevel = fuel;
//            System.out.println("Fuel level set to " + fuelLevel + " liters.");
//        } else {
//            System.out.println("Fuel level cannot be negative.");
//        }
//    }
//
//
//    public void showStatus() {
//        System.out.println("\n=== Car Status ===");
//        System.out.println("Engine        : " + (engineStatus ? "ON" : "OFF"));
//        System.out.println("Speed         : " + speed + " km/h");
//        System.out.println("Fuel Remaining: " + fuelLevel + " liters");
//        System.out.println("===================");
//    }
//
//    public static void main(String[] args) {
//    	 Scanner scanner = new Scanner(System.in);
//        car myCar = new car();
//
//
//        int choice;
//        do {
//            System.out.println("\n====== Car Control Menu ======");
//            System.out.println("1. Set Fuel Level");
//            System.out.println("2. Start Engine");
//            System.out.println("3. Stop Engine");
//            System.out.println("4. Set Speed");
//            System.out.println("5. Show Car Status");
//            System.out.println("6. Exit");
//            System.out.print("Enter your choice: ");
//            choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter fuel amount (liters): ");
//                    double fuel = scanner.nextDouble();
//                    myCar.setFuelLevel(fuel);
//                    break;
//                case 2:
//                    myCar.setEngineStatus(true);
//                    break;
//                case 3:
//                    myCar.setEngineStatus(false);
//                    break;
//                case 4:
//                    System.out.print("Enter speed (km/h): ");
//                    int speed = scanner.nextInt();
//                    myCar.setSpeed(speed);
//                    break;
//                case 5:
//                    myCar.showStatus();
//                    break;
//                case 6:
//                    System.out.println("🚘 Exiting... Thank you!");
//                    break;
//                default:
//                    System.out.println("❌ Invalid choice! Try again.");
//            }
//
//        } while (choice != 6);
//
//        scanner.close();
//    
//    }
//}
