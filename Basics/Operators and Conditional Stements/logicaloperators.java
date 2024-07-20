public class logicaloperators {
    public static void main(String[] args) {
        // Combining Boolean Expressions 
        
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30; 
        System.out.println(isWarm);

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = true;
        boolean isEligible = hasHighIncome == true || hasGoodCredit == true && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
