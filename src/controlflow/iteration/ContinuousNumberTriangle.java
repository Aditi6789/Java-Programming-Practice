package controlflow.iteration;
/*
 * ContinuousNumberTriangle - Prints continuous numbers in triangle pattern
 * Example for n=3:
   1
   2 3
   4 5 6
 * Author : Aditi
 * Date: 7-10-2026
 */
import java.util.Scanner;
public class ContinuousNumberTriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        int count = 1;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(count +" ");
                count = count + 1;
            }
            System.out.println();
        }
    }
}
