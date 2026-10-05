package controlflow.selection;
import java.util.Scanner;
public class NumberSignCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();
        if ( n < 0){
            System.out.println("Negative number");
        } else if (n == 0) {
            System.out.println("Zero");
        } else{
            System.out.println("Positive number");
        }
    }
}
