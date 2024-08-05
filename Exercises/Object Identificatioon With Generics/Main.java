public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        ObjectHandler<Dog> dogHandler = new ObjectHandler<>(dog);
        ObjectHandler<Cat> catHandler = new ObjectHandler<>(cat);
        ObjectHandler<Bird> birdHandler = new ObjectHandler<>(bird);

        dogHandler.identifyAndAct();
        catHandler.identifyAndAct();
        birdHandler.identifyAndAct();
    }
}
