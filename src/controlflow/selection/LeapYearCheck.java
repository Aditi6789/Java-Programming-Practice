package controlflow.selection;
import java.util.Scanner;
public class LeapYearCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        if ((year % 400 == 0) || year % 4 == 0 && year % 100 != 0){
            System.out.println("Leap year");
        }else {
            System.out.println("Not leap year");
        }
    }
}
