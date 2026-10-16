package strings;

/*
 Reverse String - Reverse a given string
 Example: "Aditi" -> "itidA"
 Author: Aditi
 Time: O(n)
*/

public class ReverseString {
    public static void main(String[] args) {
        String str = "Aditi";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("Reverse: " + rev);
    }
}
