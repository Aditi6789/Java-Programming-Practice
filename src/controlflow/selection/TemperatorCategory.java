package controlflow.selection;
import java.util.Scanner;
public class TemperatorCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperator : ");
        int temp = sc.nextInt();
        if (temp < 0 ){
            System.out.println("Freezing");
        } else if (temp <= 15) {
            System.out.println("Cold");
        } else if (temp <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}
