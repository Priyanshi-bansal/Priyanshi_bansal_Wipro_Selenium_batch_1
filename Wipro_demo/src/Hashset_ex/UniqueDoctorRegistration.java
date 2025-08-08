package Hashset_ex;

import java.util.HashSet;
import java.util.Scanner;

class Doctor {
    private String name;
    private String department;
    private String licenseNumber;

    public Doctor(String name, String department, String licenseNumber) {
        this.name = name;
        this.department = department;
        this.licenseNumber = licenseNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Doctor)) return false;
        Doctor other = (Doctor) obj;
        return licenseNumber.equals(other.licenseNumber);
    }

    @Override
    public int hashCode() {
        return licenseNumber.hashCode();
    }

    @Override
    public String toString() {
        return "name = " + name + ", department = " + department + ", licenseNumber = " + licenseNumber;
    }
}

public class UniqueDoctorRegistration {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        HashSet<Doctor> doctorSet = new HashSet<>();
       

        while (true) {
            System.out.println("\n1. Register Doctor");
            System.out.println("2. View All Registered Doctors");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Doctor Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String dept = sc.nextLine();

                    System.out.print("Enter License Number: ");
                    String license = sc.nextLine();

                    Doctor newDoctor = new Doctor(name, dept, license);

                    if (doctorSet.add(newDoctor)) {
                    	 System.out.println("Doctor registered successfully!");
                    } else {
                    	System.out.println("Doctor with this license number is already registered!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Registered Doctors ---");
                    for (Doctor d : doctorSet) {
                        System.out.println(d);
                    }
                    break;

                case 3:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

