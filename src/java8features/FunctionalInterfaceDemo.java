package java8features;

/*
 * Functional Interface Demo - Demonstrates @FunctionalInterface + Lambda
 * Example: Interface with single abstract method used with Lambda
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Custom Interface 2. Built-in Interface (Predicate, Function, Consumer, Supplier)
 */

import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {

    // 1. Custom Functional Interface
    @FunctionalInterface
    interface Calculator {
        int calculate(int a, int b);
    }

    public static void main(String[] args) {

        // 1. Custom Interface with Lambda
        Calculator add = (a, b) -> a + b;
        Calculator multiply = (a, b) -> a * b;
        System.out.println("Add: " + add.calculate(10, 5)); // 15
        System.out.println("Multiply: " + multiply.calculate(10, 5)); // 50

        // 2. Predicate - Returns true or false
        Predicate<Integer> isAdult = (age) -> age >= 18;
        System.out.println("Age 16 Adult? " + isAdult.test(16)); // false
        System.out.println("Age 22 Adult? " + isAdult.test(22)); // true

        // 3. Function - Takes input and returns output
        Function<String, Integer> lengthFinder = (s) -> s.length();
        System.out.println("Length of Aditi: " + lengthFinder.apply("Aditi")); // 5

        // 4. Consumer - Performs action, returns nothing
        Consumer<String> printer = (name) -> System.out.println("Hello " + name);
        printer.accept("Aditi");

        // 5. Supplier - Returns value without input
        Supplier<String> greeting = () -> "Welcome to Java 8!";
        System.out.println(greeting.get());
    }
}