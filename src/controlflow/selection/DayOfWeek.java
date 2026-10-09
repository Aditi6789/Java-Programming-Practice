package controlflow.selection;
/*
 DayOfWeek - Displays day name using switch-case
 Example: 1->Monday, 7->Sunday
 Author : Aditi
 Date: 08-10-2026
*/
import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        switch(n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number");
        }
    }
}
