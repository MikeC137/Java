public class DishMain {
    public static void main(String[] args) {
        Dish gyro = new Dish("Gyro", "Greek", 13.00);
        Dish pizza = new Dish("Pizza", "Italian", 22.00);
        gyro.displayDish();
        pizza.displayDish();
    }
}
