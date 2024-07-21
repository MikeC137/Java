import java.util.Scanner;

public class while_loops {
    public static void main(String[] args) {
        // This program will allow the user to enter an input until they enter "quit"
        String input = "";
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.nextLine().toLowerCase();
            System.out.println(input);
        }
    }
}
