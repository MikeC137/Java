import java.util.Date;
import java.awt.*;

public class ReferenceTypes {
    public static void main(String[] args) {
    // We have to use 'new' operator to allocate memory for this variable. We only do this for reference types!
    // When dealing with reference types, memory is allocated and released by Java runtime environment
        Date now = new Date();
            // Our new variable is an instance (object) of the Date class
        System.out.println(now);

        // *A reference variable stores the address of an obbject, not the object itself!
        Point point1 = new Point(1,1);
        Point point2 = point1;
        // point1 and point2 are referencing the same address which means
        // that they are dependent of each other
        point1.x = 2;
        System.out.println(point2);
    }
}
