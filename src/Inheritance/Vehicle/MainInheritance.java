package Inheritance.Vehicle;

public class MainInheritance {
    public static void main(String[] args) {
        Car c1 = new Car(4, 2000);
        c1.displayProperties();

        Bike b1 = new Bike(2, 200);
        b1.displayProperties();

        Car c2 = new Car(4, 20000, "Tata Nexon", "Dark Blue", 2020);
        System.out.println("\nCar Model: "+c2.getModel()+
                "\nNumber of wheels: "+c2.getWheels()+
                "\nColor: "+ c2.getColor()+
                "\nProduction Year: "+c2.productionYear+
                "\nCost: "+c2.getCost());
    }
}
