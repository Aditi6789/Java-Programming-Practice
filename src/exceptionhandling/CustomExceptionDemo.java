package exceptionhandling;

/*
 * Custom Exception Demo - Demonstrates Custom Exception handling
 * Example: InvalidAgeException -> Age validation (throw/catch)
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Custom Exception 2. Try-Catch Block
 */

public class CustomExceptionDemo {

    public static void main(String[] args) {
        try {
            validateAge(16); // Invalid age wala chalega
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

        try {
            validateAge(22); // Valid age wala chalega
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+ for voting, given: " + age);
        } else {
            System.out.println("Valid Age: " + age + " - Eligible to vote!");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}