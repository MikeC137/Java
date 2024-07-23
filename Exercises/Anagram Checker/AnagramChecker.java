import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        if (isAnagaram(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }

    }

    public static boolean isAnagaram(String str1, String str2) {
        // Check whether the length of the two words is the same
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str1.toCharArray();

        // Sort both arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare arrays
        return Arrays.equals(charArray1, charArray2);
    }
}