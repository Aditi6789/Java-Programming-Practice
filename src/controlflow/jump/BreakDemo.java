package controlflow.jump;

/*
 * BreakDemo - Demonstrates break statement
 * Example: Breaks loop when i=5
 * Author : Aditi
 * Date: 8-10-2026
 */
public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("\nLoop ended");
    }
}
