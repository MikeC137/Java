public abstract class Vehicle {
    // Private Fields
    private String make;
    private String model;
    private int year;

    // Constructor
    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Methods
    public void startEngine() {
        System.out.println("The engine is on");
    }

    public void stopEngine() {
        System.out.println("The engine is off");
    }

    // Setters and Getters
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle:\n Make = " + make + "\nModel = " + model + "\nYear = " + year;
    }
}
