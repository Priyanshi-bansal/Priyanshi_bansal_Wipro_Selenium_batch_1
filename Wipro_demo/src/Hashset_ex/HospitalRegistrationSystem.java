package Hashset_ex;

import java.util.HashSet;
import java.util.Scanner;

class Patient {
    private String id;
    private String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    
    public String getName() {
    	return name;
    }

    // ✅ Override equals and hashCode using only `id`
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Patient other = (Patient) obj;
        return id.equals(other.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    
}

public class HospitalRegistrationSystem {
   

    public static void main(String[] args) {
    	     HashSet<Patient> registeredPatients = new HashSet<>();
    	     Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Hospital Registration Menu ===");
            System.out.println("1. Register Patient");
            System.out.println("2. View All Registered Patients");
            System.out.println("3. Check if Patient Already Registered");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                	System.out.print("Enter Patient ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    Patient newPatient = new Patient(id, name);
                    if (registeredPatients.contains(newPatient)) {
                        System.out.println("Patient already registered with ID: " + id);
                    } else {
                        registeredPatients.add(newPatient);
                        System.out.println("Patient registered successfully.");
                    }
                    break;
                case 2:
                	if (registeredPatients.isEmpty()) {
                        System.out.println("No patients registered yet.");
                    } else {
                        System.out.println("Registered Patients:");
                        for (Patient p : registeredPatients) {
                            System.out.println("ID: " + p.getId() + ", name: " + p.getName());
                        }
                    }
                	break;
                	
                case 3:
                	System.out.print("Enter Patient ID to check: ");
                    String patientId = sc.nextLine();
                    boolean exists = registeredPatients.contains(new Patient(patientId, ""));
//                    boolean exists = false;
//                    for (Patient p : registeredPatients) {
//                        if (p.getId().equals(patientId)) {
//                            exists = true;
//                            break;
//                        }
//                    }

                    if(exists) {
                    	System.out.println("Patient is already registered.");
                    }
                    else {
                    System.out.println("Patient not found.");
                    }
                    break;
                case 4:
                	System.out.println("Exiting system.");
                	break;
                default:
                	System.out.println("Invalid choice.");
                	
            }
        } while (choice != 4);
    }



}

