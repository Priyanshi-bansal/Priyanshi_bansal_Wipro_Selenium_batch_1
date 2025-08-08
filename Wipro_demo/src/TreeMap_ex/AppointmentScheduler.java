package TreeMap_ex;

import java.time.LocalTime;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Appointment {
    String patientName;
    String doctorName;
    String time;

    public Appointment(String patientName, String doctorName, String time) {
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Time: " + time + " | Patient: " + patientName + " | Doctor: " + doctorName;
    }
}

public class AppointmentScheduler {

    private static TreeMap<String, Appointment> appointments = new TreeMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to Hospital Appointment Scheduler (Current Time as ID - No Formatter)");

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Appointment (Current Time)");
            System.out.println("2. View All Appointments");
            System.out.println("3. Remove Appointment");
            System.out.println("4. Reschedule Appointment");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                	 System.out.print("Enter Patient Name: ");
                     String patient = sc.nextLine();

                     System.out.print("Enter Doctor Name: ");
                     String doctor = sc.nextLine();

                     
                     String time = LocalTime.now().toString();

                     if (appointments.containsKey(time)) {
                         System.out.println("An appointment already exists at this time. Try again.");
                         return;
                     }

                     Appointment appt = new Appointment(patient, doctor, time);
                     appointments.put(time, appt);
                     System.out.println("Appointment added at time: " + time);
                 
                    break;
                case 2:
                	 if (appointments.isEmpty()) {
                         System.out.println("No appointments found.");
                     } else {
                         System.out.println("Scheduled Appointments:");
                         for (Map.Entry<String, Appointment> entry : appointments.entrySet()) {
                             System.out.println(entry.getValue());
                         }
                     }
                    break;
                case 3:
                	 System.out.print("Enter Appointment Time to Remove (e.g., 14:30:45.123456789): ");
                     String timeToRemove = sc.nextLine();

                     Appointment removed = appointments.remove(timeToRemove);
                     if (removed != null) {
                         System.out.println("Removed Appointment: " + removed);
                     } else {
                         System.out.println("No appointment found for that time.");
                     }
                    break;
                case 4:
                	 System.out.print("Enter Existing Appointment Time to Reschedule: ");
                     String oldTime = sc.nextLine();

                     Appointment appoint = appointments.remove(oldTime);
                     if (appoint == null) {
                         System.out.println("No appointment found for that time.");
                         return;
                     }

                     String newTime = LocalTime.now().toString(); 

                     if (appointments.containsKey(newTime)) {
                         System.out.println("An appointment already exists at new time. Rescheduling failed.");
                         appointments.put(oldTime, appoint);
                         return;
                     }

                     Appointment updated = new Appointment(appoint.patientName, appoint.doctorName, newTime);
                     appointments.put(newTime, updated);
                     System.out.println("Appointment rescheduled to time: " + newTime);
                 
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    

   
}