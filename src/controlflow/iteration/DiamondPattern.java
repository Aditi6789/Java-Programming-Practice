package controlflow.iteration;
/*
DiamondPattern - Prints diamond star pattern
Example for n=3:
   *
  * *
 * * *
  * *
   *
Author : Aditi
Date: 7-10-2026
 */
import java.util.Scanner;
public class DiamondPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        for (int i = 1; i<=n; i++){
            for (int j = (n-i); j > 0; j-- ){
                System.out.print(" ");
            }
            for (int k =1; k<=i; k++){
                System.out.print("* ");
            }
                System.out.println();
            }
        for (int i = (n-1) ; i > 0; i--){
            for (int j = 0; j < (n-i); j++){
                System.out.print(" ");
            }
            for (int k =1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
