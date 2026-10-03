package operators;
/**
 * UnaryOperators - Demonstrates all Unary operators in Java
 * Author : Aditi
 * Date: 2-10-2026
 */
public class UnaryOperators {
    public static void main(String[] args) {
        int d = 1;
        int l = ++d; //preincrement
        System.out.println("l = " + l); // 2

        int m = --d; //predecrement
        System.out.println("m = " + m); // 1

        int k = d++;  //postincrement
        System.out.println("k = " + k ); //1
        System.out.println("d = " + d); //2

        int i = d--; //postdecrement
        System.out.println("i = " + i); // 2
        System.out.println("d = " + d); // 1
    }
}
