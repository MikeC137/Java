import java.util.Scanner;
import java.text.NumberFormat;

public class mortgagecalc {
    public static void main(String[] args) {
        // Principal
        NumberFormat currency = NumberFormat.getCurrencyInstance(); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double Principal = scanner.nextDouble();

        scanner.nextLine();

        // Interest Rate
        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble() / 100;

        scanner.nextLine();

        // Period
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        scanner.nextLine();

        // Calculation 
        double mortgageNumerator = Principal * (interestRate / 12) ;
        double mortgageDenominator = 1 - (Math.pow(( 1 + interestRate/12), -12 * period));
        System.out.println("Mortgage: " + currency.format(mortgageNumerator/mortgageDenominator));
    }
}