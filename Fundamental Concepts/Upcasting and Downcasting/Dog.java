public class Dog extends Animal {
	@Override
	public void makeNoise() {
		System.out.println("Bark");
	}

	public void playFetch() {
		System.out.println("Fetch, human!");
	}
}
