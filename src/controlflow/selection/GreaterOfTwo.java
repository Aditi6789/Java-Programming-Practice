package controlflow.selection;

import java.util.Scanner;

/*
 GreaterOfTwo - Find greater of two numbers
 Example: Input 7, 8 -> 8 is greater than 7
 Author : Aditi
 Date: 7-10-2026
*/

public class GreaterOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        if (a > b){
            System.out.println(a + " is greater than " + b);
        }else if (b > a) {
            System.out.println(b + " is greater than " + a);
        } else {
            System.out.println("Both numbers are equal");
        }
        sc.close();
    }
}
