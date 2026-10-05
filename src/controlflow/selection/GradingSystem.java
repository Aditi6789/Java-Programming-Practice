package controlflow.selection;
import java.util.Scanner;
public class GradingSystem {
    static void main(String[] args) {
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
    }
}
