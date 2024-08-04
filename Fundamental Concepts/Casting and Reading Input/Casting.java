public class Casting{
    public static void main(String[] args) {
        // Implicit Casting - Automatic casting that happens when a value is converted to a bigger data type 
        // byte > short > int > long > float > double
        short x = 1; // a short is 2 bytes
        int y = x+2; // an integer is 4 bytes
        System.out.println(y);

        // Explicit Casting
        double d = 1.1;
        int i = (int)d + 2;
        System.out.println(i);

        // Wrapper Classes - Used to cast incompatible types
        String s = "1";
        int n = Integer.parseInt(s) + 2;


    }
}