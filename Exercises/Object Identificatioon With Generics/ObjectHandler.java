public class ObjectHandler<T> {
    private T obj;

    public ObjectHandler(T obj) {
        this.obj = obj;
    }

    public void identifyAndAct() {
        if (obj instanceof Dog) {
            ((Dog) obj).bark();
        } else if (obj instanceof Cat) {
            ((Cat) obj).meow();
        } else if (obj instanceof Bird) {
            ((Bird) obj).chirp();
        } else {
            System.out.println("Unknown object type");
        }
    }
}