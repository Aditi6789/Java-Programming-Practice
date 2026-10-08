package controlflow.jump;
/*
 * ReturnDemo - Demonstrates return statement
 * Example: Return from method
 * Author : Aditi
 * Date: 8-10-2026
 */
public class ReturnDemo {
    public static void main(String[] args) {
        System.out.println("Before method call");
        display();
        System.out.println("After method call - this won't print if return executed before");
    }
    static void display() {
        System.out.println("Inside display method");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                return;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nEnd of display");
    }
}
