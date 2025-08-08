package Hashmap_ex;

import java.util.*;

class PatientData {
    private String id;
    private String name;
    private String disease;

    public PatientData(String id, String name, String disease) {
        this.id = id;
        this.name = name;
        this.disease = disease;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDisease() {
        return disease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
    
    
    @Override
    public String toString() {
    	return "Patient{id = " + id + ", name = " + name + ", disease = " + disease;
    }


public class Hospitalmap {

    public static void main(String[] args) {
        HashMap<String, PatientData> patientMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Hospital Registration Menu ===");
            System.out.println("1. Register Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Remove Patient");
            System.out.println("4. Update Patient Details");
            System.out.println("5. Get Patient Count");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: 
                    System.out.print("Enter Patient ID: ");
                    String id = sc.nextLine();
                    if (patientMap.containsKey(id)) {
                        System.out.println("Patient already registered with ID: " + id);
                    } else {
                        System.out.print("Enter Patient Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Disease: ");
                        String disease = sc.nextLine();
                        patientMap.put(id, new PatientData(id, name, disease));
                        System.out.println("Patient registered successfully.");
                    }
                    break;

                case 2: 
                    if (patientMap.isEmpty()) {
                        System.out.println("No patients registered.");
                    } else {
                        System.out.println("Registered Patients:");
                        for (PatientData p : patientMap.values()) {
                            System.out.println("ID: " + p.getId() + ", Name: " + p.getName() + ", Disease: " + p.getDisease());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to remove: ");
                    String removeId = sc.nextLine();
                    if (patientMap.remove(removeId) != null) {
                        System.out.println("Patient removed successfully.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient ID to update: ");
                    String updateId = sc.nextLine();
                    PatientData existingPatient = patientMap.get(updateId);
                    if (existingPatient != null) {
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new disease: ");
                        String newDisease = sc.nextLine();
                        existingPatient.setName(newName);
                        existingPatient.setDisease(newDisease);
                        System.out.println("Patient details updated successfully.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5: 
                    System.out.println("Total registered patients: " + patientMap.size());
                    break;

                case 6: 
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 6);

        sc.close();
    }
}
}

