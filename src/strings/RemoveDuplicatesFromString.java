package strings;

/*
 Remove Duplicate Characters - Remove duplicate chars from string
 Example: "Aditi" -> "Adit"
 Author: Aditi
 Time: O(n)
*/

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String str = "Aditi";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("Result: " + result);
    }
}