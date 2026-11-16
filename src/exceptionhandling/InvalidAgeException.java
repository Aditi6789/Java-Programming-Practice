package exceptionhandling;

/*
 * InvalidAgeException - Common Custom Exception
 * Author: Aditi
 */
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}