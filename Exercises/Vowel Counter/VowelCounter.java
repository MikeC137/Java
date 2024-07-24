import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("Enter a string: ");
        String userString = scanner.nextLine().toLowerCase();

        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == 'a' || userString.charAt(i) == 'e' || userString.charAt(i) == 'i' || userString.charAt(i) == 'o' || userString.charAt(i) == 'u' ) {
                counter += 1;
            } 
        }
        System.out.println("The number of vowels in the string is: " + counter);
    }
}