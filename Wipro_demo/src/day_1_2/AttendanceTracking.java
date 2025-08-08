package day_1_2;
import java.util.Scanner;

public class AttendanceTracking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

	        System.out.print("Enter number of students: ");
	        int numStudents = sc.nextInt();
	        

	        String[] studentNames = new String[numStudents];
	        String[][] attendance = new String[numStudents][7];

	        // Input student names
	        for (int i = 0; i < numStudents; i++) {
	            System.out.print("Enter name for student " + (i + 1) + ": ");
	            studentNames[i] = sc.nextLine();
	        }

	        // Input attendance
	        System.out.println("\nEnter attendance (P for Present, A for Absent):");
	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Attendance for " + studentNames[i] + ":");
	            for (int j = 0; j < 7; j++) {
	                System.out.print(days[j] + ": ");
	                attendance[i][j] = sc.next().toUpperCase();
	            }
	        }

	        // Display Attendance Table
	        System.out.println("\n--- Weekly Attendance Report ---");
	        System.out.print("Name\t");
	        for (String day : days) {
	            System.out.print(day + "\t");
	        }
	        System.out.println("Total Present");

	        for (int i = 0; i < numStudents; i++) {
	            System.out.print(studentNames[i] + "\t");
	            int presentCount = 0;
	            for (int j = 0; j < 7; j++) {
	                System.out.print(attendance[i][j] + "\t");
	                if (attendance[i][j].equals("P")) {
	                    presentCount++;
	                }
	            }
	            System.out.println(presentCount);
	        }

	        sc.close();
	}

}
