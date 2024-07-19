public class mathclass{
    public static void main(String[] args) {
        int rounding = Math.round(1.1F);
        int ceiling = (int)Math.ceil(1.3F); 
        int floor = (int)Math.floor(1.7F);
        int max = Math.max(2, 1);
        int min = Math.min(1,5);
        double random = Math.random(); // Displays a decimal from 0-1 by default
        System.out.println(random);
    }
}