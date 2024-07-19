import java.util.Scanner;
import java.text.NumberFormat;

public class mortgagecalc {
    public static void main(String[] args) {
        // Principal
        NumberFormat currency = NumberFormat.getCurrencyInstance(); 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        Double Principal = scanner.nextDouble();
        // System.out.println(currency.format(Principal));

        scanner.nextLine();

        // Interest Rate
        System.out.print("Annual Interest Rate: ");
        Double interestRate = scanner.nextDouble() / 100;
        // System.out.println(interestRate);

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