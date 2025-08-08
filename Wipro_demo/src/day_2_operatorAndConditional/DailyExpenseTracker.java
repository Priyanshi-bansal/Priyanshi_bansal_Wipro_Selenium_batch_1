package day_2_operatorAndConditional;

import java.util.Scanner;

public class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: number of people to track
        System.out.print("Enter number of people: ");
        int numPeople = sc.nextInt();

        // Jagged array to store expenses of each person
        double[][] expenses = new double[numPeople][];

        // Input expenses for each person
        for (int i = 0; i < numPeople; i++) {
            System.out.print("\nEnter number of days Person " + (i + 1) + " recorded expenses: ");
            int days = sc.nextInt();

            expenses[i] = new double[days];

            for (int j = 0; j < days; j++) {
                System.out.print("Enter expense for day " + (j + 1) + ": ₹");
                expenses[i][j] = sc.nextDouble();
            }
        }

        // Displaying expenses
        System.out.println("\n--- Daily Expenses Summary ---");
        for (int i = 0; i < expenses.length; i++) {
            System.out.print("Person " + (i + 1) + " spent: ");
            double total = 0;
            for (int j = 0; j < expenses[i].length; j++) {
                System.out.print("₹" + expenses[i][j] + " ");
                total += expenses[i][j];
            }
            System.out.println(" | Total: ₹" + total);
        }

        sc.close();
    }
}

