public class Car extends Vehicle {
    // Private Fields
    private int numOfSeats;

    // Constructor
    public Car(String make, String model, String color, double mileage, int year, int numOfSeats) {
        super(make, model, color, mileage, year);
        this.numOfSeats = numOfSeats;
    }

    // Methods
    @Override
    public void startEngine() {
        System.out.println("The engine of " + getMake() + " " + getModel() + "is on");
    }

    @Override
    public void stopEngine() {
        System.out.println("The engine of " + getMake() + " " + getModel() + "is off");
    }

    @Override
    public void drive(double milesDriven) {
        System.out.println("Driving Car: " + getMake() + " " + getModel());
        setMileage(getMileage() + milesDriven);
        System.out.println("Total distance driven: " + getMileage());
    }

    // Getter and Setter
    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
