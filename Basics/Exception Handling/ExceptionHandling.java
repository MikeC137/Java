public class exception_handling {
    public static void main(String[] args) {
        // Exception: An unwanted result that interrupts the normal flow of a program

        try {
            // Code that may cause an exception
            int myInt = Integer.parseInt("pants");
            System.out.println("After parsing pants"); // Won't be executed if there is an exception before
        }
        catch (NumberFormatException nfe) { // MultiCatch works by separating exceptions using a block (|) character --> catch (NumberFormatException | NullPointerException e)
            // Code that we want to execute if this type of exception occurs
            System.out.println("You can't make a number out of that!");
        }
        finally {
            // Code gets executed whether there was an exception or not
            System.out.println("in the finally block");
        }
        System.out.println("End here");
    }
}