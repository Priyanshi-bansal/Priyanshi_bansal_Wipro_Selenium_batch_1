package arrayList_Ex;

import java.util.ArrayList;
import java.util.Scanner;


class Patient {
    private String name;
    private int age;
    private String gender;
    private String disease;

    public Patient(String name, int age, String gender, String disease) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Disease: " + disease);
    }

}

public class PatientManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Patient> patientList = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Patient Management System ---");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Patient by Index");
            System.out.println("4. Update Patient Disease");
            System.out.println("5. Remove Patient by Index");
            System.out.println("6. Remove Patient by Name");
            System.out.println("7. Check if Patient Exists");
            System.out.println("8. Show Total Patients");
            System.out.println("9. Clear All Records");
            System.out.println("10. Check if List is Empty");
            System.out.println("11. Exit");
            System.out.print("Choose option: ");

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    patientList.add(new Patient(name, age, gender, disease));
                    System.out.println("Patient Added Successfully!");
                    break;

                case 2:
                    if (patientList.isEmpty()) {
                        System.out.println("No patients found.");
                    } else {
                        System.out.println("All Patients:");
                        for (Patient p : patientList) {
                            p.displayDetails();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Index to Fetch: ");
                    int index = Integer.parseInt(sc.nextLine());

                    if (index >= 0 && index < patientList.size()) {
                        patientList.get(index).displayDetails();
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 4:
                    System.out.print("Enter Patient Name to Update Disease: ");
                    String updateName = sc.nextLine();
                    boolean found = false;

                    for (Patient p : patientList) {
                        if (p.getName().equalsIgnoreCase(updateName)) {
                            System.out.print("Enter New Disease: ");
                            String newDisease = sc.nextLine();
                            p.setDisease(newDisease);
                            System.out.println("Disease updated.");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 5:
                    System.out.print("Enter index to remove: ");
                    int removeIndex = Integer.parseInt(sc.nextLine());

                    if (removeIndex >= 0 && removeIndex < patientList.size()) {
                        patientList.remove(removeIndex);
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;

                case 6:
                    System.out.print("Enter name to remove: ");
                    String removeName = sc.nextLine();
                    boolean removed = patientList.removeIf(p -> p.getName().equalsIgnoreCase(removeName));

                    if (removed) {
                        System.out.println("Patient removed.");
                    } else {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 7:
                    System.out.print("Enter name to check: ");
                    String existsName = sc.nextLine();
                    boolean exists = patientList.stream().anyMatch(p -> p.getName().equalsIgnoreCase(existsName));
                    System.out.println(exists ? "Patient exists." : " Patient not found.");
                    break;

                case 8:
                    System.out.println("Total Patients: " + patientList.size());
                    break;

                case 9:
                    patientList.clear();
                    System.out.println("All records cleared.");
                    break;

                case 10:
                    System.out.println(patientList.isEmpty() ? "List is empty." : "List has records.");
                    break;

                case 11:
                    System.out.println("Exiting system...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}


//class Patient {
//    private String name;
//    private int age;
//    private String gender;
//    private String disease;
//
//    public Patient(String name, int age, String gender, String disease) {
//        this.name = name;
//        this.age = age;
//        this.gender = gender;
//        this.disease = disease;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void displayDetails() {
//        System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Disease: " + disease);
//    }
//}
//
//public class PatientManagementSystem {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        ArrayList<Patient> patientList = new ArrayList<>();
//
//        while (true) {
//            System.out.println("\n--- Patient Management System ---");
//            System.out.println("1. Register New Patient");
//            System.out.println("2. View All Patients");
//            System.out.println("3. Search Patient by Name");
//            System.out.println("4. Exit");
//            System.out.print("Choose an option: ");
//
//            int choice = Integer.parseInt(sc.nextLine());
//
//            switch (choice) {
//                case 1:
//                   
//                    System.out.print("Enter Name: ");
//                    String name = sc.nextLine();
//
//                    System.out.print("Enter Age: ");
//                    int age = Integer.parseInt(sc.nextLine());
//
//                    System.out.print("Enter Gender: ");
//                    String gender = sc.nextLine();
//
//                    System.out.print("Enter Disease: ");
//                    String disease = sc.nextLine();
//
//                    Patient newPatient = new Patient(name, age, gender, disease);
//                    patientList.add(newPatient);
//                    System.out.println(" Patient Registered Successfully!");
//                    break;
//
//                case 2:
//                    
//                    if (patientList.isEmpty()) {
//                        System.out.println(" No patients registered today.");
//                    } else {
//                        System.out.println("\n--- List of Patients ---");
//                        for (Patient p : patientList) {
//                            p.displayDetails();
//                        }
//                    }
//                    break;
//
//                case 3:
//                    
//                    System.out.print("Enter patient name to search: ");
//                    String searchName = sc.nextLine();
//                    boolean found = false;
//
//                    for (Patient p : patientList) {
//                        if (p.getName().equalsIgnoreCase(searchName)) {
//                            System.out.println("Patient Found:");
//                            p.displayDetails();
//                            found = true;
//                            break;
//                        }
//                    }
//
//                    if (!found) {
//                        System.out.println("Patient not found.");
//                    }
//                    break;
//
//                case 4:
//                    System.out.println("Thank you! Exiting system...");
//                    sc.close();
//                    return;
//
//                default:
//                    System.out.println("Invalid option. Try again.");
//            }
//        }
//    }
//}
//
