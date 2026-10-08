package controlflow.iteration;
/*
 PyramidPattern - Prints pyramid star pattern
 Example for n=3:
   *
  * *
 * * *
 Author : Aditi
 Date: 7-10-2026
 */
import java.util.Scanner;
public class PyramidPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        for (int i = 1; i<=n; i++){
            for (int j = (n-i); j > 0; j-- ){
                System.out.print(" ");
            }
            for (int k =1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
