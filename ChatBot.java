import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("AI Bot: Hello! Type 'bye' to exit.");

        while(true) {
            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase();

            if(input.equals("hello")) {
                System.out.println("AI Bot: Hi there!");
            } else if(input.equals("how are you")) {
                System.out.println("AI Bot: I am fine.");
            } else if(input.equals("bye")) {
                System.out.println("AI Bot: Goodbye!");
                break;
            } else {
                System.out.println("AI Bot: I don't understand.");
            }
        }
        sc.close();
    }
}