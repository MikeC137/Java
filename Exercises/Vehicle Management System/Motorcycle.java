public class Motorcycle extends Vehicle {
    // Private Fields

    private boolean hasSidecar;

    // Constructor
    public Motorcycle(String make, String model, String color, double mileage, int year, boolean hasSidecar) {
        super(make, model, color, mileage, year);
        this.hasSidecar = hasSidecar;
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
        System.out.println("Riding Motorcycle: " + getMake() + " " + getModel());
        setMileage(getMileage() + milesDriven);
        System.out.println("Total distance driven: " + getMileage());
    }

}
