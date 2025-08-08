package day_1_2;

import java.util.Scanner;

public class ATMCashTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] denominations = {500, 200, 100, 50};
        int days = 3;

        int[][] notes = new int[denominations.length][days];

        // Input number of notes
        System.out.println("Enter the number of notes for each denomination per day:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println("Denomination ₹" + denominations[i] + ":");
            for (int j = 0; j < days; j++) {
                System.out.print("Day " + (j + 1) + ": ");
                notes[i][j] = sc.nextInt();
            }
        }

        // Display Notes Table
        System.out.println("\n--- ATM Cash Tracker ---");
        System.out.print("Denomination\t");
        for (int d = 1; d <= days; d++) {
            System.out.print("Day " + d + "\t");
        }
        System.out.println("Total Notes");

        int totalCash = 0;

        for (int i = 0; i < denominations.length; i++) {
            int denominationTotal = 0;
            System.out.print("₹" + denominations[i] + "\t\t");
            for (int j = 0; j < days; j++) {
                System.out.print(notes[i][j] + "\t");
                denominationTotal += notes[i][j];
                totalCash += notes[i][j] * denominations[i];
            }
            System.out.println(denominationTotal);
        }

        // Cash per day
        System.out.println("\n--- Cash Available Per Day ---");
        for (int j = 0; j < days; j++) {
            int cashPerDay = 0;
            for (int i = 0; i < denominations.length; i++) {
                cashPerDay += notes[i][j] * denominations[i];
            }
            System.out.println("Day " + (j + 1) + ": ₹" + cashPerDay);
        }

        System.out.println("\nTotal Cash in ATM for all days: ₹" + totalCash);
        sc.close();
    }
}

