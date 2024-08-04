import java.util.List;
import java.util.Arrays;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "d");
		list.stream()
				.filter((item) -> item.equals("a"))
				.forEach((item) -> System.out.println(item));
	}
}