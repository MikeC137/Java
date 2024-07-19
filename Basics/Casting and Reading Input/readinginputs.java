import java.util.Scanner;

public class readinginputs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // System.in is used to work with the terminal window
        System.out.print("Age: ");
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old.");

        scanner.nextLine();
        
        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Your name is " + name);
        }; 
    }
