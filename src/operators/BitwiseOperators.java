package operators;
/**
 * BitwiseOperators - Demonstrates all  Bitwise operators in Java
 * Author : Aditi
 * Date: 2-10-2026
 */
public class BitwiseOperators {
    public static void main(String[] args){

        //--------------- OR operator  --------------
        System.out.println("OR operator : ");
        System.out.println(" 0 | 0 = " +  (0 | 0 ));
        System.out.println(" 0 | 1 = " +  (0 | 1 ));
        System.out.println(" 1 | 0 = " +  (1 | 0 ));
        System.out.println(" 1 | 1 = " +  (1 | 1 ));

        //---------------  AND operator --------------
        System.out.println("AND operator : ");
        System.out.println(" 0 & 0 = " +  (0 & 0 ));
        System.out.println(" 0 & 1 = " +  (0 & 1 ));
        System.out.println(" 1 & 0 = " +  (1 & 0 ));
        System.out.println(" 1 & 1 = " +  (1 & 1 ));

        //-------  XOR Operator --------------
        System.out.println("XOR operator");
        int a = 2^3; // 2^3 --> 010 ^ 011 --> 001 --> 1
        System.out.println("2^3 = " + a );

        System.out.println(" 0 ^ 0 = " +  (0 ^ 0 ));
        System.out.println(" 0 ^ 1 = " +  (0 ^ 1 ));
        System.out.println(" 1 ^ 0 = " +  (1 ^ 0 ));
        System.out.println(" 1 ^ 1 = " +  (1 ^ 1 ));


        //------------- Bitwise shift operator  ----------------
        //left shift
        int b = 8 ;
        b = b<<1; // 01000 --> 10000 --> 16
        System.out.println(b); //16

        //right shift
        int c = 8;
        c = c >> 1 ; // 1000 --> 100 --> 4
        System.out.println(c); //4
    }
}
