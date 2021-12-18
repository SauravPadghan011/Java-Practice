package Inheritance.Vehicle;

public class Car extends Vehicle {
    Car(int wheels, int cost) {
        super(wheels, cost);
    }

    Car(int wheels, int cost, String model, String color, int productionYear) {
        super(wheels, cost);
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public int getWheels() {
        return this.wheels;
    }

    public int getCost() {
        return this.cost;
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
