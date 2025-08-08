package classDemo;

import java.util.Scanner;

public class chatBot {

    void getResponse(String input) {
        input = input.toLowerCase().trim();

        if (input.equals("hi") || input.equals("hello")) {
            System.out.println("Bot: Hello! I’m your virtual assistant.");
        } else if (input.equals("help")) {
            System.out.println("Bot: I can respond to: hi, help, about, contact, and bye.");
        } else if (input.equals("about")) {
            System.out.println("Bot: I'm a simple chatbot created using Java!");
        } else if (input.equals("contact")) {
            System.out.println("Bot: You can reach us at support@example.com");
        } else if (input.equals("bye")) {
            System.out.println("Bot: Bye! Chat with you soon.");
        } else {
            System.out.println("Bot: Sorry, I don't understand that command.");
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        chatBot bot = new chatBot();

        System.out.println("=== Welcome to Simple ChatBot ===");
        System.out.println("Type 'help' to see what I can do. Type 'bye' to exit.\n");

        while (true) {
            System.out.print("You: ");
            String message = sc.nextLine();

            bot.getResponse(message);

            if (message.equalsIgnoreCase("bye")) {
                break;
            }
        }

        sc.close();
    }
}

