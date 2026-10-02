package operators;
/**
 * RelationalOperators - Demonstrates all Relational operators in Java
 * Author : Aditi
 * Date: 2-10-2026
 */
public class RelationalOperators {
    public static void main(String[] args){
        int a = 15;
        int b = 10;

        boolean c = (a == b);
        System.out.println(" a == b --> " + c ); // false

        boolean d = (a != b) ;
        System.out.println(" a != b --> " + d ); // true

        boolean e = (a > b) ;
        System.out.println(" a > b --> " + e ); // true

        boolean f = (a < b) ;
        System.out.println(" a < b --> " + f ); // false

        boolean g = (a >= b) ;
        System.out.println(" a >= b --> " + g ); // true

        boolean h = (a <= b) ;
        System.out.println(" a <= b --> " + h ); // false
    }
}
