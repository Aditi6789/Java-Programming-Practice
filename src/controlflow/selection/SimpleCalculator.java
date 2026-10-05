package controlflow.selection;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("operation: ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();
        sc.close();
        switch (operator){
            case '+':
                System.out.println( "Result = " + (firstNum + secondNum));
                break;
            case '-':
                System.out.println( "Result = " + (firstNum - secondNum));
                break;
            case '*':
                System.out.println( "Result = " + (firstNum * secondNum));
                break;
            case '/':
                System.out.println( "Result = " + (firstNum / secondNum));
                break;
            default:
                System.out.println("wrong");
        }
    }
}
