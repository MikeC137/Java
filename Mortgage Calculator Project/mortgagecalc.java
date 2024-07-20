import java.util.Scanner;
import java.text.NumberFormat;

public class mortgagecalc {
    public static void main(String[] args) {
        // Principal
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        // Interest Rate
        System.out.print("Annual Interest Rate: ");
        double interestRate = scanner.nextDouble() / 100;

        // Period
        System.out.print("Period (Years): ");
        int period = scanner.nextInt();

        // Calculation 
        final byte MONTHS_IN_YEAR = 12;
        NumberFormat currency = NumberFormat.getCurrencyInstance(); 
        double mortgageNumerator = principal * (interestRate / MONTHS_IN_YEAR) ;
        double mortgageDenominator = 1 - (Math.pow(( 1 + interestRate/MONTHS_IN_YEAR), -MONTHS_IN_YEAR * period));
        System.out.println("Mortgage: " + currency.format(mortgageNumerator/mortgageDenominator));
    }
}