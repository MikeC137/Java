import java.util.Scanner;
public class basic_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumberString = "" ;
        String secondNumberString = "" ;
        float numOne = 0 ;
        float numTwo = 0 ;
        String operation = "" ;
        System.out.println("Welcome to the Basic Calculator!");

        
        while (true) {
        
            // First Number
            while (true) {
                System.out.print("Enter the first number: ");
                firstNumberString = scanner.nextLine();

                try {
                    numOne = Float.parseFloat(firstNumberString);
                    break;
                }
                catch (NumberFormatException nfe) {
                    System.out.println("Please enter a number: ");
                }
            }

            // Second Number
            while (true) {
                System.out.print("Enter the second number: ");
                secondNumberString = scanner.nextLine();

                try {
                    numTwo = Float.parseFloat(secondNumberString);
                    break;
                }
                catch (NumberFormatException nfe) {
                    System.out.println("Please enter a number: ");
                }
            }
            
            // Operation
            System.out.println("Choose an operation ( +, -, *, ? ): +");
            

        }
    }
}