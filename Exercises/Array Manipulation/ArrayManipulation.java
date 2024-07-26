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
        int[] intArray = new int[numOfElements];

        // Input the integers from the user
        System.out.print("Enter the numbers of the array: ");
        for (int i = 0; i < numOfElements; i++) {
            intArray[i] = scanner.nextInt();
        }

        // Display all array elements
        System.out.println(Arrays.toString(intArray));

        // Display the maximum and minimum numbers of the array
        minAndMax(intArray);

        // Calculate and display the average of the array elements.
        average(intArray);

        // Display reversed array
        reversedArray(intArray);

        // Sort and display array
        Arrays.parallelSort(intArray);
        System.out.println("Sorted Array: " + Arrays.toString(intArray));

        scanner.close();
    }

    // Minimum and Maximum Method
    public static void minAndMax(int array[]) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    // Average Method
    public static void average(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("Average: " + average);
    }

    // Reversed Array method
    public static void reversedArray(int[] array) {
        System.out.print("Reversed Array: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}