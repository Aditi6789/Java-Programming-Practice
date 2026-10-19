package strings;

/*
 Toggle Case - Convert uppercase to lowercase and vice versa
 Example: "Hello World Aditi" -> hELLO wORLD aDITI
 Author: Aditi
 Time: O(n)
*/

public class ToggleCase {
    public static void main(String[] args) {
        String str = "Hello World Aditi";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println("Toggled String: " + result);
    }
}
