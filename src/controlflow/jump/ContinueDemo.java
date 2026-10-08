package controlflow.jump;

/*
 ContinueDemo - Demonstrates continue statement
 Example: Skips 5
 Author : Aditi
 Date: 8-10-2026
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop ended");
    }
}
