package controlflow.selection;
import java.util.Scanner;

/*
 LargestOfThree - Find largest of three numbers
 Example: Input 5, 9, 3 -> Largest number is 9
 Author : Aditi
 Date: 5-10-2026
*/

public class LargestOfThree {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        System.out.print("Enter the third number: ");
        int thirdNum = sc.nextInt();
        int largest = firstNum;
        if (secondNum > largest){
            largest = secondNum;
        }
        if ( thirdNum > largest){
            largest = thirdNum;
        }
        System.out.println("Largest number is " + largest);
        sc.close();
    }
}
