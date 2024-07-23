public class StringsAndEscSequences {

    public static void main(String[] args) {
    String message = "Hello World" + "!!";
    // Useful Methods in the String Class
        System.out.println(message.endsWith("!"));
        System.out.println(message.indexOf("W")); //-1 means the character doesn't exist in our string
        System.out.println(message.length());
        System.out.println(message.replace("!", "$")); // Returns a new string rather than
        // modifying the old one because Strings are immutable in Java
        System.out.println(message.toUpperCase());
    
    // Escape Sequences: Special characters preceded by a backslash that allow you to include
    // characters like newlines, tabs, and other special symbols within string literals.
        
        // Double quotes in a string
        System.out.println("My name is \"Mike\""); 

        // Backslash in a string (important for file locations)
        System.out.println("c:\\Windows\\Desktop\\...");

        // Adding a new line to a string
        System.out.println("My name is:\nMike ");
        
    }

}