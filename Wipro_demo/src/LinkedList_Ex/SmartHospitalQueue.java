package LinkedList_Ex;

import java.util.LinkedList;
import java.util.Scanner;

class Patient {
    private String id;
    private String name;

    public Patient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    
}

public class SmartHospitalQueue {
    public static void main(String[] args) {
        LinkedList<Patient> patientQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Hospital Queue Management System ");
            System.out.println("1. Add New Patient");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Cancel Appointment (Remove Patient)");
            System.out.println("4. View All Patients");
            System.out.println("5. View Next and Last Patient");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                case 2:
                    System.out.print("Enter Patient ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();
                    Patient newPatient = new Patient(id, name);

                    if (patientQueue.contains(newPatient)) {
                        System.out.println("Patient with ID " + id + " already exists!");
                    } else {
                        if (choice == 1) {
                            patientQueue.addLast(newPatient); // Normal
                            System.out.println("Patient added to queue.");
                        } else {
                            patientQueue.addFirst(newPatient); // Emergency
                            System.out.println("Emergency patient added to front.");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to remove: ");
                    String removeId = sc.nextLine();
                    boolean removed = patientQueue.removeIf(p -> p.getId().equals(removeId));
                    if (removed) {
                        System.out.println("Patient removed successfully.");
                    } else {
                        System.out.println("Patient ID not found.");
                    }
                    break;

                case 4:
                    if (patientQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Patient List:");
                        int pos = 1;
                        for (Patient p : patientQueue) {
                        	System.out.println(pos++ + ". ID: " + p.getId() + ", Name: " + p.getName());

                        }
                    }
                    break;

                case 5:
                    if (patientQueue.isEmpty()) {
                        System.out.println("Queue is empty.");
                    } else {
                        System.out.println("Next Patient: " + patientQueue.getFirst());
                        System.out.println("Last Patient: " + patientQueue.getLast());
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}


