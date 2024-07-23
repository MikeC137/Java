import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        
        StringBuilder reverseStringBuilder = new StringBuilder(userString);
        String reverseString = reverseStringBuilder.reverse().toString();

        if (reverseString.equals(userString)){
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
        
        scanner.close();
    }
}