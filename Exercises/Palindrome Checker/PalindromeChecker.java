import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userString = scanner.next().toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        String reverseString = "";
        
        for (int i = userString.length() - 1; i >= 0 ; i--) {
            reverseString += userString.charAt(i);
        } 

        if (reverseString.equals(userString)){
            System.out.println("The string is a palindrome");

        } else {
            System.out.println("The string is not a palindrome");
        }
    }
}