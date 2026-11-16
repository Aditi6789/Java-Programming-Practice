package exceptionhandling;

/*
 * Try Catch Demo - Demonstrates Custom Exception + try-catch-finally
 * Example: Age Validation -> Placement Eligibility Check (throw vs throws)
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Custom Exception 2. try-catch-finally 3. throw/throws
 */

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class TryCatchDemo {
    public static void main(String[] args) {
        // Test Case 1: Invalid Age
        try {
            validateAge(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block - Cleanup done");
        }

        System.out.println("-------------------");

        // Test Case 2: Valid Age
        try {
            validateAge(22);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+ for placement");
        } else {
            System.out.println("Eligible for placement: " + age);
        }
    }
}
