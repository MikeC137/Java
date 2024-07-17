import java.util.Arrays;

public class arrays{

    public static void main(String[] args) {
        int [] numbers = new int[5]; // 5 represents the length of the array
        numbers[0] = 1;
        numbers[1] = 2;
        // Arrays have a fixed number of elements
                System.out.println(Arrays.toString(numbers));
        // The other and easier way to initialize an array...
        int [] nums = {2, 3, 5, 4, 1};
        System.out.println(nums.length);
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        // Two-dimensional array (used to represent a matrix or a table of values)
        int[][] twodarray = new int [2][3]; // 2 rows and 3 columns
        twodarray[0][0] = 1;
        System.out.println(Arrays.deepToString(twodarray));

        // Three-Dimensional Array (used in simulations and 3D modeling)
        int [][][] threedarray = new int [2][3][5]; // The 3rd pair of [] represents the length of that dimension
        threedarray[0][0][0] = 1 ;
        System.out.println(Arrays.deepToString(threedarray));

        // And the easier way to initialize a multi-dimensional array (curly braces syntax)
        int[][] lastArray = {{1,2,3}, {4,5,6}};
        System.out.println(Arrays.deepToString(lastArray));
    }

}