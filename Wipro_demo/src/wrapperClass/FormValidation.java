package wrapperClass;

import java.util.Scanner;

public class FormValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name;
        Integer age = null;
        Double marks = null;

        while (true) {
            System.out.print("Enter your Name: ");
            name = sc.nextLine().trim();
            if (!name.isEmpty()) {
                break;
            } else {
                System.out.println("Name cannot be empty. Please try again.");
            }
        }

        while (true) {
            System.out.print("Enter your Age: ");
            String ageStr = sc.nextLine();
            try {
                age = Integer.parseInt(ageStr);
                if (age >= 5 && age <= 25) {
                    break;
                } else {
                    System.out.println("Age must be between 5 and 25.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid age. Please enter a valid number.");
            }
        }

        while (true) {
            System.out.print("Enter your Total Marks: ");
            String marksStr = sc.nextLine();
            try {
                marks = Double.parseDouble(marksStr);
                if (marks >= 0 && marks <= 100) {
                    break;
                } else {
                    System.out.println("Marks must be between 0 and 100.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid marks. Please enter a valid number.");
            }
        }

        System.out.println("\n Registration Successful!");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("Marks: " + marks);

        sc.close();
    }
}
