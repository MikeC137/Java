import java.io.*;

public class DeserializationDemo {
	public static void main(String[] args) throws IOException {
		User user = null;
		try {
			FileInputStream fis = new FileInputStream("user.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			user = (User) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return;
		}

		System.out.println("User object deserialized successfully");
		System.out.println("Name: " + user.name);
		System.out.println("Password: " + user.password);
	}
}
