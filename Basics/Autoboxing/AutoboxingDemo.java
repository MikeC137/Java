public class AutoboxingDemo {
    public static void main(String[] args) {
        Integer obj = 10; // Autoboxing: int to Integer
        int num = obj; // Unboxing: Integer to int

        // Automatic conversion in expressions
        Integer sum = obj + num;
        System.out.println("sum = " + (sum + 5));
    }
}
