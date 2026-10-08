package controlflow.iteration;
/*
 InvertedTriangle - Prints inverted star triangle pattern
 Example for n=3:
 * * * *
 * * *
 * *
 *

 Author : Aditi
 Date: 7-10-2026
 */
import java.util.Scanner;
public class InvertedTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = n; i > 0; i-- ){
            for (int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
