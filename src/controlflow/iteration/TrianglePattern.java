package controlflow.iteration;

/*
 TrianglePattern - Prints right triangle star pattern
 Example for n=3:
 *
 * *
 * * *
 Author : Aditi
 Date: 7-10-2026
 */
import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
