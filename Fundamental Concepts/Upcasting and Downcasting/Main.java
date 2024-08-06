public class Main {
	public static void main(String[] args) {
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		doAnimalStuff(myDog);
		doAnimalStuff(myCat);
	}

	public static void doAnimalStuff(Animal animal) {
		animal.makeNoise();
		if (animal instanceof Dog) {
			((Dog) animal).playFetch();
		} else if (animal instanceof Cat) {
			((Cat) animal).scratch();
		}
	}
}
