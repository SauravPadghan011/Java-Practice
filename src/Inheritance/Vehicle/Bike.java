package Inheritance.Vehicle;

public class Bike extends Vehicle{
    Bike(int wheels, int cost) {
        super(wheels, cost);
    }

    Bike(int wheels, int cost, String model, String color, int productionYear) {
        super(wheels, cost);
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return this.model;
    }

    public String getColor() {
        return this.color;
    }

    public int getProdYear() {
        return this.productionYear;
    }
}
