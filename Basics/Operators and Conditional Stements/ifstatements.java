public class ifstatements {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) { // curly braces added to define a code block
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20) {
            System.out.println("Beautiful day!");
        } else {
            System.out.println("Cold Day");
        }

        // Simplifying if statements
        int income = 120_000;
        boolean highIncome = (income > 100_000); 
        // Wrap the expression in parentheses for readability
        // Remove unecessary conditional statements
        
    }
}
