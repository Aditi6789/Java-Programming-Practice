package controlflow.selection;

import java.util.Scanner;

/*
 GradingSystem - Calculate grade based on marks
 Example: Input 85 -> Grade B, Input 35 -> Fail
 Author : Aditi
 Date: 7-10-2026
*/

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks : ");
        int marks = sc.nextInt();
        if (marks >= 90){
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 40) {
            System.out.println("D");
        }else {
            System.out.println("Fail");
        }
        sc.close();
    }
}

