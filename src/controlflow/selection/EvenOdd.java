package controlflow.selection;

import java.util.Scanner;

/*
 EvenOdd - Check if a number is Even or Odd
 Example: Input 4 -> Even number, Input 7 -> Odd number
 Author : Aditi
 Date: 7-10-2026
*/

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n % 2 == 0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
        sc.close();
    }
}
