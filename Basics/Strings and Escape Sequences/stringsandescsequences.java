public class stringsandescsequences {

    public static void main(String[] args) {
    String message = "Hello World" + "!!";
    // Useful Methods in the String Class
        System.out.println(message.endsWith("!"));
        System.out.println(message.indexOf("W")); //-1 means the character doesn't exist in our string
        System.out.println(message.length());
        System.out.println(message.replace("!", "$")); // Returns a new string rather than
        // modifying the old one because Strings are immutable in Java
        System.out.println(message.toUpperCase());
    
    // Escape Sequences
    
        
    }

}