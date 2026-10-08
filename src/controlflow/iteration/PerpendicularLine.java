package controlflow.iteration;
/*
 PerpendicularLine - Prints T-shaped perpendicular line pattern
 Example for n=5:
 *****
   *
   *
   *
   *
 Author : Aditi
 Date: 7-10-2026
 */
import java.util.Scanner;
public class PerpendicularLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0) {
                    System.out.print("*");
                }else{
                    if (j == (n / 2)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
