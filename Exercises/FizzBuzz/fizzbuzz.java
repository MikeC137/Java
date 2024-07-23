import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        boolean isDivisibleToThree = (number % 3 == 0);
        boolean isDivisibleToFive = (number % 5 == 0);

        if (isDivisibleToThree && isDivisibleToFive)
            System.out.println("FizzBuzz");
        else if (isDivisibleToThree) 
            System.out.println("Fizz");
        else if (isDivisibleToFive) 
            System.out.println("Buzz");
        else 
            System.out.println(number);

    }
} 
