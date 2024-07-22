import java.util.Scanner;

public class BasicCalculator  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstNumberString = "";
        String secondNumberString = "";
        float numOne;
        float numTwo;
        String operation;
        float result;
        String keepCalculating;

        System.out.println("Welcome to the Basic Calculator!");
        while (true) {

            // First Number
            while (true) {
                System.out.print("Enter the first number: ");
                firstNumberString = scanner.nextLine();

                try {
                    numOne = Float.parseFloat(firstNumberString);
                    break;
                } catch (NumberFormatException nfe) {
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
                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter a number: ");
                }
            }

            // Operation
            while (true) {
                System.out.println("Choose an operation ( +, -, *, / ): +");
                operation = scanner.nextLine().trim();
                if (!(operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))) {
                    System.out.println("Invalid input. Please enter one of the following operations: +, -, *, /.");
                    continue;
                } else {
                    switch (operation) {
                        case "+":
                            result = numOne + numTwo;
                            System.out.println("Result: " + result);
                            break;
                        case "-":
                            result = numOne - numTwo;
                            System.out.println("Result: " + result);
                            break;
                        case "*":
                            result = numOne * numTwo;
                            System.out.println("Result: " + result);
                            break;
                        case "/":
                            if (numTwo == 0) {
                                System.out.println("You cannot divide by 0.");
                            } else {
                                result = numOne / numTwo;
                                System.out.println("Result: " + result);
                            }
                            break;
                    }
                    break;
                }
            }

            // Ask whether to continue calculating or not
            while (true) {
                System.out.println("Would you like to perform another calculation? (yes/no): ");
                keepCalculating = scanner.nextLine();

                if (keepCalculating.equalsIgnoreCase("yes")) {
                    break;
                } else if (keepCalculating.equalsIgnoreCase("no")) {
                    System.out.println("Goodbye!");
                    scanner.close();
                    return;
                } else {
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }

        }
    }
}