package operators;
/**
 * ArithmeticOperators - Demonstrates all Arithmetic operators in Java
 * Author : Aditi
 * Date: 2-10-2026
 */
public class ArithmeticOperators {
    public static void main(String[] args){
        int a = 5;
        int b = 10;

        //------------- Basic operation -----------------
        System.out.println("Addition of a and b : " + (a + b) );
        System.out.println("Subtract a from b : " + (b - a) );
        System.out.println("Multiplication of a and b : " + (a * b) );
        System.out.println("Divide b by a : " + (b / a) );

       //---------------  Addition by using variables  --------------------
        int c = a +  2;
        System.out.println("c = " + c); // 7

        // h = h * 2 --> h *= 2 (more optimized)

         c += 1 ; // c = c + 1 --> 7 + 1 --> now assign 8 into c --> c = 8
        System.out.println("c += 1 then c = " + c); // 8

        c -= 2; // c = c - 2 --> 8 - 2 = 6 --> now assign 6 into c -->  c = 6
        System.out.println("c -= 2 then c = " + c ); // 6

        c *= 3 ; // c = c * 3 --> 6 * 3 --> c = 18
        System.out.println("c *= 3 then c = " + c);

        c /= 4; // c = c / 4 --> 18/4 --> 4
        System.out.println("c /= 4 then c = " + c); //4

        c %= 2; // c = c % 2 --> 4 % 2 --> 0 (return remainder)
        System.out.println( "c %= 2 then c = " + c); //0


        //---------------- Preincrement and postincrement / decrement ----------------

        int d = 1;

        ++d; //preincrement
        System.out.println("d = " + d); // 2

        --d; //predecrement
        System.out.println("d = " + d); // 1

        int k = d++;  //postincrement
        System.out.println("k = " + k ); //1
        System.out.println("d = " + d); //2

        int i = d--; //postdecrement
        System.out.println("i = " + i); // 2
        System.out.println("d = " + d); // 1
    }
}
