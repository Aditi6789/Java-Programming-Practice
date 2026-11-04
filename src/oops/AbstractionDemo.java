package oops;

/*
 * Abstraction Demo - Demonstrates Abstract class
 * Example: Vehicle -> Car (abstract method implemented)
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Abstract Class 2. Abstract Method
 */

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Car("Thar", 2024);
        v.start(); // Car wala chalega
        v.displayInfo();
    }
}

abstract class Vehicle {
    protected String model;
    protected int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    abstract void start(); // abstract method

    void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {
    public Car(String model, int year) {
        super(model, year);
    }

    @Override
    void start() {
        System.out.println(model + " is starting with key...");
    }
}