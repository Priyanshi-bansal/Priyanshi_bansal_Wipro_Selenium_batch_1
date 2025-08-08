package TreeMap_ex;

import java.util.*;

class PatientAppointment {
    private String patientName;
    private int patientId;
    private String time;
    private String purpose;

    public PatientAppointment(String patientName, int patientId, String time, String purpose) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.time = time;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Patient ID: " + patientId +
               ", Name: " + patientName +
               ", Purpose: " + purpose +
               ", Time: " + time;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PatientAppointment)) return false;
        PatientAppointment other = (PatientAppointment) obj;
        return this.patientId == other.patientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientId);
    }
}

public class PatientAppSystem {

    public static void main(String[] args) {
        TreeMap<Integer, PatientAppointment> appointments = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n---- Patient Appointment Scheduler ----");
            System.out.println("1. Add Appointment");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove an Appointment");
            System.out.println("4. Check Next and Last Appointment");
            System.out.println("5. Reschedule an Appointment");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter Patient ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (appointments.containsKey(id)) {
                        System.out.println("Appointment with this ID already exists.");
                        break;
                    }

                    System.out.print("Enter Patient Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Appointment Purpose: ");
                    String purpose = sc.nextLine();

                    System.out.print("Enter Appointment Time (HH:MM:SS): ");
                    String time = sc.nextLine();
                    

                    appointments.put(id, new PatientAppointment(name, id, time, purpose));
                    System.out.println("Appointment added successfully.");
                    break;

                case 2:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments found.");
                    } else {
                        System.out.println("\nScheduled Appointments:");
                        for (Map.Entry<Integer, PatientAppointment> entry : appointments.entrySet()) {
                            System.out.println(entry.getValue());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Patient ID to remove: ");
                    int removeId = sc.nextInt();
                    if (appointments.remove(removeId) != null) {
                        System.out.println("Appointment removed.");
                    } else {
                        System.out.println("No appointment found with that ID.");
                    }
                    break;

                case 4:
                    if (appointments.isEmpty()) {
                        System.out.println("No appointments available.");
                    } else {
                        System.out.println("Next Appointment ID: " + appointments.firstKey());
                        System.out.println("Last Appointment ID: " + appointments.lastKey());
                    }
                    break;

                case 5:
                    System.out.print("Enter Patient ID to reschedule: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    if (appointments.containsKey(updateId)) {
                        System.out.print("Enter Updated Name: ");
                        String newName = sc.nextLine();

                        System.out.print("Enter Updated Purpose: ");
                        String newPurpose = sc.nextLine();

                        System.out.print("Enter Updated Time (HH:MM:SS): ");
                        String newTime = sc.nextLine();

                        appointments.put(updateId, new PatientAppointment(newName, updateId, newTime, newPurpose));
                        System.out.println("Appointment rescheduled.");
                    } else {
                        System.out.println("No appointment found with that ID.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting ....");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
