import java.util.Date;

public class referencetypes {
    public static void main(String[] args) {
    // We have to use 'new' operator to allocate memory for this variable. We only do this for reference types!
    // When dealing with reference types, memory is allocated and released by Java runtime environment
        Date now = new Date();
            // Our new variable is an instance (object) of the Date class
        System.out.println(now);
    }
}
