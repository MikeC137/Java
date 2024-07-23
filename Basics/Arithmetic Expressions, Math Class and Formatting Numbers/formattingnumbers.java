import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance(); {  // NumberFormat is an abstract class, therefore it can't
        // be instantiated. We can't use "new NumberFormat;"
        String money = currency.format(1234567.891);
        System.out.println(money);

        // Method Chaining - Calling multiple methods together
        String percentage = NumberFormat.getPercentInstance().format(0.34);
        System.out.println(percentage);
    }
}
}
