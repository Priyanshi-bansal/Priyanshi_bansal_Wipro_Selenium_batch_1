package abstract_ex;

import java.util.Scanner;

abstract class Game {
 abstract void play();
 abstract void stop();
 abstract void end();
}


class Cricket extends Game {

	
 void play() {
     System.out.println("Cricket game has started!");
 }

 void stop() {
     System.out.println("Cricket game is paused.");
 }


 void end() {
     System.out.println("Cricket game has ended.");
 }
}


class Football extends Game {

 void play() {
     System.out.println("Football match has begun!");
 }

 void stop() {
     System.out.println("Football match is on hold.");
 }


 void end() {
     System.out.println("Football match is over.");
 }
}

public class GameFramework {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Choose a game:");
     System.out.println("1. Cricket\n2. Football");
     int choice = sc.nextInt();

     Game game;

     switch (choice) {
         case 1:
             game = new Cricket();
             break;
         case 2:
             game = new Football();
             break;
         default:
             System.out.println("Invalid choice.");
             sc.close();
             return;
     }

     game.play();
     game.stop();
     game.end();

     sc.close();
 }
}
