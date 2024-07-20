import java.util.Scanner;
import java.text.NumberFormat;

public class mortgagecalc {
    public static void main(String[] args) {
        // Principal
        NumberFormat currency = NumberFormat.getCurrencyInstance(); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

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
        final byte MONTHS_IN_YEAR = 12;
        double mortgageNumerator = principal * (interestRate / MONTHS_IN_YEAR) ;
        double mortgageDenominator = 1 - (Math.pow(( 1 + interestRate/MONTHS_IN_YEAR), -MONTHS_IN_YEAR * period));
        System.out.println("Mortgage: " + currency.format(mortgageNumerator/mortgageDenominator));
    }
}