package wrapperClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ScoreBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> scoreboard = new HashMap<>();

        System.out.print("Enter number of players: ");
        int n = Integer.parseInt(sc.nextLine());

       
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter player name: ");
            String name = sc.nextLine();

            System.out.print("Enter score for " + name + ": ");
            Integer score = Integer.parseInt(sc.nextLine());

            scoreboard.put(name, score); 
        }

        
        System.out.println("\n--- Scoreboard ---");
        for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
            System.out.println(entry.getKey() + " scored " + entry.getValue());
        }

        
        String topPlayer = null;
        int topScore = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : scoreboard.entrySet()) {
            if (entry.getValue() > topScore) {
                topScore = entry.getValue(); 
                topPlayer = entry.getKey();
            }
        }

        System.out.println("\n Top Scorer: " + topPlayer + " with " + topScore + " points");
        
        sc.close();
    }
}

