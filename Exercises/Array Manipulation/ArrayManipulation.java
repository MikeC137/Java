import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements;
        String currentArrayElement;
         
        // Input the array of integers from the user
        System.out.print("How many numbers would you like to be in the array? ");
        numOfElements = scanner.nextInt();
        int [] intArray = new int[numOfElements];

        System.out.print("Enter the numbers of the array: ");
        for (int i = 0; i < numOfElements; i++) {
            intArray[i] = scanner.nextInt();
        }
        System.out.print(Arrays.toString(intArray));
    }
}