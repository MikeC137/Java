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
        System.out.println("Annual Interest Rate: ");
        Double interestRate = scanner.nextDouble() / 100;
        // System.out.println(interestRate);

    }
}