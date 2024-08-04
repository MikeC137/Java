public class ElectricCar extends Vehicle implements Electric {
    private double batteryLevel;

    public ElectricCar(String make, String model, String color, double mileage, int year, double batteryLevel) {
        super(make, model, color, mileage, year);
        this.batteryLevel = batteryLevel;
    }

    public double getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void charge() {
        setBatteryLevel(100);
        checkBatteryStatus();
    }

    @Override
    public void discharge() {
        setBatteryLevel(0);
        checkBatteryStatus();
    }

    @Override
    public void checkBatteryStatus() {
        System.out.println("Battery Level: " + batteryLevel + "%");
    }

    @Override
    public void startEngine() {
        System.out.println("The engine of " + getMake() + " " + getModel() + "is off");
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
}
