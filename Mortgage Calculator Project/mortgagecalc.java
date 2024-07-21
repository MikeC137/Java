import java.util.Scanner;
import java.text.NumberFormat;

public class mortgagecalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double principal = 0 ;
        double interestRate = 0;
        byte period = 0;

        // Principal
        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextDouble();

            if (principal < 1_000 || principal > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,000.");
                continue;
            } else {
                break;
            }
        }   

        // Interest Rate
        while (true) {
            System.out.print("Annual Interest Rate: ");
            interestRate = scanner.nextDouble();

            if (interestRate < 0 || interestRate > 30) {
                System.out.println("Enter a value greater than 0 and less than or equal to 30.");
                continue;
            } else {
                interestRate /= 100;
                break;
            }
        }

        // Period
        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextByte();

            if (period < 1 || period > 30) {
                System.out.println("Enter a value between 1 and 30");
                continue;
            } else {
                break;
            }
        }

        // Calculation 
        final byte MONTHS_IN_YEAR = 12;
        NumberFormat currency = NumberFormat.getCurrencyInstance(); 
        double mortgageNumerator = principal * (interestRate / MONTHS_IN_YEAR) ;
        double mortgageDenominator = 1 - (Math.pow(( 1 + interestRate/MONTHS_IN_YEAR), -MONTHS_IN_YEAR * period));
        System.out.println("Mortgage: " + currency.format(mortgageNumerator/mortgageDenominator));
    }
}