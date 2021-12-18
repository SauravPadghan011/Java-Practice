package Inheritance.Vehicle;

public class Vehicle {

    public int wheels;
    public int cost;

    public String model;
    public String color;
    public int productionYear;

    Vehicle(int wheels, int cost) {
        this.wheels = wheels;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void displayProperties() {
        System.out.println("Wheels: "+this.wheels+" Cost: "+this.cost);
    }
}
