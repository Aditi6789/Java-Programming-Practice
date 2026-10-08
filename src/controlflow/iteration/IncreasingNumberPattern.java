package controlflow.iteration;
/*
 IncreasingNumberPattern - Prints increasing numbers in triangle pattern
 Example for n=3:
 1
 1 2
 1 2 3
 Author : Aditi
 Date: 7-10-2026
 */
import java.util.Scanner;
public class IncreasingNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(k +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
