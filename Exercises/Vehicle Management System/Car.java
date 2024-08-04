public class Car extends Vehicle {
    // Private Fields
    private int numOfSeats;

    // Constructor
    public Car(String make, String model, String color, double mileage, int year, int numOfSeats) {
        super(make, model, color, mileage, year);
        this.numOfSeats = numOfSeats;
    }

    // Methods
    public void startEngine() {
        System.out.println("The engine of " + getMake() + " " + getModel() + "is on");
    }

    public void stopEngine() {
        System.out.println("The engine of " + getMake() + " " + getModel() + "is off");
    }

    // Getter and Setter
    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
