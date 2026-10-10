package controlflow.selection;

import java.util.Scanner;

/*
 LeapYearCheck - Check if year is leap year or not
 Example: Input 2024 -> Leap year, Input 2023 -> Not leap year
 Author : Aditi
 Date: 5-10-2026
*/

public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Leap year");
        }else {
            System.out.println("Not leap year");
        }
        sc.close();
    }
}
