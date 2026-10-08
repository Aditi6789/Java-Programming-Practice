package controlflow.jump;

/*
 LabeledBreakDemo - Demonstrates labeled break
 Example: Breaks outer loop from inner loop
 Author : Aditi
 Date: 7-10-2026
 */
public class LabeledBreakDemo {
    public static void main(String[] args) {
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop;
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
        System.out.println("Outer loop ended");
    }
}
