package exceptionhandling;

/*
 * Throw Vs Throws Demo - Difference between throw and throws
 * Example: User Authentication Check
 * Author: Aditi
 * Time: O(1)
 * Type: 1. throw keyword 2. throws keyword 3. Custom Exception
 */

class AuthenticationException extends Exception {
    public AuthenticationException(String msg) {
        super(msg);
    }
}

public class ThrowVsThrowsDemo {
    public static void main(String[] args) {
        try {
            checkPassword("aditi123");
            checkPassword("wrong");
        } catch (AuthenticationException e) {
            System.out.println("Login Failed: " + e.getMessage());
        }
    }

    // throws = tells caller that this method can throw exception
    public static void checkPassword(String password) throws AuthenticationException {
        String correctPass = "aditi123";

        if (!password.equals(correctPass)) {
            // throw = actually throwing the exception object
            throw new AuthenticationException("Invalid Password - throw example");
        } else {
            System.out.println("Login Success - Welcome Aditi!");
        }
    }
}