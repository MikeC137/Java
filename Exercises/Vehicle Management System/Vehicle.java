public abstract class Vehicle {
    // Private Fields
    private String make;
    private String model;
    private String color;
    private double mileage;
    private int year;

    // Constructor
    public Vehicle(String make, String model, String color, double mileage, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.year = year;
    }

    // Methods
    public void startEngine() {
        System.out.println("The engine is on");
    }

    public void stopEngine() {
        System.out.println("The engine is off");
    }

    public void ride(double milesDriven) {
        System.out.println("The vehicle just completed a trip");
        mileage = milesDriven;
    }

    // Getters and Setters

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return color;
    }

    public double getMileage() {
        return mileage;
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setMileage(double mileage) {
        this.mileage += mileage;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle:\n Make = " + make + "\nModel = " + model + "\nColor = " + color + "\nMileage" + mileage
                + " Miles" + "\nYear = " + year;
    }
}
