import java.io.*;

public class SerializationDemo {
	public static void main(String[] args) throws IOException {
		User user = new User();
		user.name = "Alice";
		user.password = "pass123";

		try {
			FileOutputStream fos = new FileOutputStream("user.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(user);
			oos.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("User object serialized successfully");
	}
}
