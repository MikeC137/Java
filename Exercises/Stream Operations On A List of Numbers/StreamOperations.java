import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 4, 17, 13, 6, 30, 54, 3, 72);
        List<Integer> modifiedList = integerList.stream()
                .filter((n) -> n % 2 == 0)
                .map((n) -> (n * n))
                .sorted((a, b) -> b - a)
                .toList();
        System.out.println("Processed List: " + modifiedList);
    }
}
