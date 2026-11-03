package oops;

/*
 * Polymorphism Demo - Demonstrates Compile-time & Run-time Polymorphism
 * Example: Employee -> Developer (Overriding), work() overloaded
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Overloading (Compile-time)  2. Overriding (Run-time)
 */

public class PolymorphismDemo {
    public static void main(String[] args) {
        // 1. Overloading Example
        Employee emp = new Employee("Rahul", 25);
        emp.work();
        emp.work("--- Employee Details (Overloaded) ---");

        System.out.println("--------------------");

        // 2. Overriding Example - Parent reference, Child object
        Employee dev = new Developer("Aditi", 20, 101);
        dev.work(); // Developer wala chalega
        dev.role();
    }
}

class Employee {
    protected String name;
    protected int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Overloaded Methods
    public void work() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public void work(String msg) {
        System.out.println(msg);
        work();
    }

    public void role() {
        System.out.println(name + " is an Employee");
    }
}

class Developer extends Employee {
    int empId;

    public Developer(String name, int age, int empId) {
        super(name, age);
        this.empId = empId;
    }

    @Override
    public void work() {
        System.out.println("--- Developer Details (Overriding) ---");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Emp Id : " + empId);
    }

    @Override
    public void role() {
        System.out.println(name + " is a Developer with Id: " + empId);
    }
}