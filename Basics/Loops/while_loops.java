import java.util.Scanner;

public class while_loops {
    public static void main(String[] args) {
        // This program will allow the user to enter an input until they enter "quit"
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            if (input.equals("pass"))
                continue; // Used to skip the current iteration and move directly to the next of the loop
            if (input.equals("quit"))
                break;
            System.out.println(input);
        }

        // A Do-While Loop is similar to a while loop but it gets executed at least once
        // If the condition is false in a while loop, the code will not be executed
        // In contrast, do-while loops check the condition last

        // do {
        //     System.out.print("Input: ");
        //     input = scanner.nextLine().toLowerCase();
        //     System.out.println(input);
        // } while (!input.equals("quit"));
    }
}
