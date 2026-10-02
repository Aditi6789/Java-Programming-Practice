package operators;
/**
 * LogicalOperators - Demonstrates all Logical operators in Java
 * Author : Aditi
 * Date: 2-10-2026
 */
public class LogicalOperators {
    public static void main(String[] args){
        int a = 10;
        int b = 12;
        int c = 20;
        int d = 15;

        //AND operator (&&)
        boolean e = ((a>b) && (c>d));
        System.out.println("(a>b) && (c>d) : " + e); //false

        int age = 12;
        if (age > 0 && age < 19 ){
            System.out.println("You are not eligible for vote");
        }
        int marks = 10;
        if (marks > 35 && marks < 100 ){  //Short circuit condition occurs
            System.out.println("Pass");
        }else{
            System.out.println("Fail - marks : " + marks);
        }

        //OR operator (||)
        boolean r = ((a>b) || (c>d));
        System.out.println("(a>b) || (c>d) : " + r);

        //NOT operator
        boolean s = !(a>b);
        System.out.println("!(a>b) : " + s);

    }
}
