package basics;
/**
 * DataTypesDemo - Demonstrates all primitive data types in Java
 * Author : Aditi
 * Date: 1-10-2026
 */
public class DataTypesDemo {
    public static void main(String[] args){

        // --- 1. Integers Datatype -- byte short int long
        byte byteValue = 5;
        short shortValue = 10;
        int intValue = 4000;
        long longValue = 1_00_000;

        //Real Number -- float double
        float floatValue = 10.89f;
        double doubleValue = 23.7889;
        double scientificValue = 6.023e23;

        // --- 3. Other Types
        char charValue = 'a';
        boolean bool = false;

        System.out.println("===== Java Data Types Demo ====== \n");

        System.out.println("---Integers value--");
        System.out.println(byteValue + " " + shortValue + " " + intValue + " " + longValue);
        System.out.println();
        System.out.println("---Real numbers value--");
        System.out.println( floatValue + " " + doubleValue + " " + scientificValue);
        System.out.println();
        System.out.println("---Character value--");
        System.out.println(charValue);
        System.out.println();
        System.out.println("---boolean value--");
        System.out.println(bool);
    }
}
