package controlflow.selection;
import java.util.Scanner;
public class PositiveCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        if (n >= 0){
            System.out.print("Positive number");
        }
    }
}
