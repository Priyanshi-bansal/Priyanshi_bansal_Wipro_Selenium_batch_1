package LinkedList_Ex;

import java.util.LinkedList;
import java.util.Scanner;

public class PatientQueue {
    public static void main(String[] args) {

        LinkedList<String> patientQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n Hospital Patient Queue System");
            System.out.println("1. Add New Patient (Normal)");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Remove first patient");
            System.out.println("4. Remove Specific Patient");
            System.out.println("5. View All Patients");
            System.out.println("6. View First and Last Patient");
            System.out.println("7. Search Patient in Queue");
            System.out.println("8. Total Patients in Queue");
            System.out.println("9. Clear Queue");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter patient name: ");
                    String patient = sc.nextLine();
                    patientQueue.addLast(patient);
                    System.out.println("Patient added to queue.");
                    break;

                case 2:
                    System.out.print("Enter emergency patient name: ");
                    String emergencyPatient = sc.nextLine();
                    patientQueue.addFirst(emergencyPatient);
                    System.out.println("Emergency patient added to front.");
                    break;

                case 3:
                    if (!patientQueue.isEmpty()) {
                    	String remove= patientQueue.removeFirst();
                    	System.out.println("Removed patient :" + remove );
                    } else {
                        System.out.println("No patients in queue.");
                    }
                    break;

                case 4:
                    System.out.print("Enter patient name to remove: ");
                    String nameToRemove = sc.nextLine();
                    boolean patientToRemove = patientQueue.remove(nameToRemove);
                    if (patientToRemove) {
                        System.out.println("Removed patient: " + nameToRemove);
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5:
                    if (!patientQueue.isEmpty()) {
                        System.out.println("Current Patient Queue:");
                        int position = 1;
                        for (String p : patientQueue) {
                            System.out.println(position + ". " + p);
                            position++;
                        }
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 6:
                    if (!patientQueue.isEmpty()) {
                        System.out.println("First: " + patientQueue.getFirst());
                        System.out.println("Last: " + patientQueue.getLast());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 7:
                    System.out.print("Enter patient name to search: ");
                    String searchName = sc.nextLine();
                    int index = patientQueue.indexOf(searchName);
                    if (index != -1) {
                        System.out.println("Patient found at position: " + (index + 1));
                    } else {
                        System.out.println("Patient not found in queue.");
                    }
                    break;

                case 8:
                    System.out.println("Total patients in queue: " + patientQueue.size());
                    break;

                case 9:
                    patientQueue.clear();
                    System.out.println("Queue cleared.");
                    break;

                case 10:
                    System.out.println("Exiting... Stay Healthy!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 10);

        sc.close();
    }
}

