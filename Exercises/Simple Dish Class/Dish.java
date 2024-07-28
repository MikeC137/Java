public class Dish {
    // Private Fields
    private String name;
    private String cuisine;
    private double price;

    // Constructor
    public Dish(String name, String cuisine, double price) {
        this.name = name;
        this.cuisine = cuisine;
        this.price = price;
    }

    // Accessors/Getters
    public String getName() {
        return name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public double getPrice() {
        return price;
    }

    // Mutators/Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Method
    public void displayDish() {
        System.out.println("Dish Name: " + name + "\nCuisine: " + cuisine + "\nPrice: $" + price + "");
    }

}