import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfElements;
        String currentArrayElement;
        int maxNumber;
         
        // Input the array of integers from the user
        System.out.print("How many numbers would you like to be in the array? ");
        numOfElements = scanner.nextInt();
        int [] intArray = new int[numOfElements];

        // Input the integers from the user
        System.out.print("Enter the numbers of the array: ");
        for (int i = 0; i < numOfElements; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Display all array elements in order
        Arrays.parallelSort(intArray);
        System.out.println(Arrays.toString(intArray));

        // Display the maximum and minimum numbers of the array
        minAndMax(intArray);

        // Calculate and display the average of the array elements.

    }

    // Minimum and Maximum Method
    public static void minAndMax(int array[]) {
        int min = array[0];
        int max = array[array.length - 1];
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }

    // Average Method
    
}