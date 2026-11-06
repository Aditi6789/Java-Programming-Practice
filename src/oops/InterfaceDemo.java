package oops;

/*
 * Interface Demo - Demonstrates 100% Abstraction using interface + Multiple Inheritance
 * Example: Vehicle data abstraction, Car implements multiple interfaces
 * Author: Aditi
 * Time: O(1)
 * Type: 1. interface 2. implements 3. default method
 */

public class InterfaceDemo { // Aditi6789
    public static void main(String[] args) { // Aditi6789 Aditi6789
        // 1. Interface Example
        Cars c1 = new Cars("Tesla Model 3", 0);
        c1.start();
        System.out.println(c1.getModel());
        c1.displayInfo();
        c1.chargeBattery();
        System.out.println("Fuel: " + c1.getFuelCapacity());
        c1.stop();

        System.out.println();

        // 2. Polymorphism via Interface
        VehicleInterface v1 = new Cars("Mahindra Thar", 57);
        v1.start();
        v1.stop();
    }
}

interface VehicleInterface { // Aditi6789
    void start(); // 1 usage
    void stop(); // 1 usage
    int getFuelCapacity(); // 1 usage
    String getModel(); // 1 usage

    default void displayInfo() { // 1 usage Aditi6789
        System.out.println("This is a Vehicle - Interface Demo");
    }
}

interface ElectricVehicle { // Aditi6789
    void chargeBattery(); // 1 usage
}

class Cars implements VehicleInterface, ElectricVehicle { // 2 usages Aditi6789
    private String model; // 2 usages
    private int fuelCapacity; // 2 usages

    public Cars(String model, int fuelCapacity) { // 1 usage Aditi6789
        this.model = model;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void start() {
        System.out.println(model + " car started - Vroom!");
    }

    @Override
    public void stop() {
        System.out.println(model + " car stopped");
    }

    @Override
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void chargeBattery() {
        System.out.println(model + " battery charging - 80% done");
    }
}
