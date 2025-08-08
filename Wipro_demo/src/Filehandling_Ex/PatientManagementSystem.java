package Filehandling_Ex;

import java.util.Scanner;
import java.io.*;

class Patient {
    private String name;
    private int id;
    private String disease;
    private int age;

    public Patient(int id, String name, String disease, int age) {
        this.id = id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    @Override
    public String toString() {
        return id + "," + name + "," + disease + "," + age;
    }
}

public class PatientManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            
            BufferedWriter writer = new BufferedWriter(new FileWriter("Patient.txt", true));
            
           
            while (true) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                System.out.print("Enter Name: ");
                String name = sc.next();
                System.out.print("Enter Disease: ");
                String disease = sc.next();
                System.out.print("Enter Age: ");
                int age = sc.nextInt();

                Patient p = new Patient(id, name, disease, age);
                writer.write(p.toString());
                writer.newLine(); 
                System.out.println("Patient saved to file");

                System.out.print("Add another patient? (yes/no): ");
                String choice = sc.next();
                if (choice.equalsIgnoreCase("no")) {
                    break;
                }
            }
            
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        // Reading from file
        System.out.println("\n<---------- Patient Records ---------->");
        try {
            BufferedReader br = new BufferedReader(new FileReader("Patient.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }
}

