public class ArithmeticExpressions{
    public static void main(String[] args) {
        int x = 1;
        x++; // The operator can also be applied as a prefix (++x) in this case
        System.out.println(x);
        int y = x++; 
        // The value of y will remain the same because the operator was applied as a postfix. X will increase
        System.out.println(y);

        // Augmented assignment operators
        x += 2;
        x -= 2;
        x *= 2;
        x /= 2;
    }

}