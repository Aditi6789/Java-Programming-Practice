package strings;

/*
 First Non Repeating Char - Find first non repeating char
 Example: "swiss" -> w
 Author: Aditi
 Time: O(n)
*/

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "swiss";

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println("First Non Repeating Char: " + str.charAt(i));
                return;
            }
        }
        System.out.println("No non repeating character found");
    }
}