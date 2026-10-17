package strings;
import java.util.Arrays;

/*
 Check Anagram - Check if two strings are anagram
 Example: "listen" & "silent" -> true
 Author: Aditi
 Time: O(n log n) due to sorting
*/

public class CheckAnagram {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        if (Arrays.equals(a1, a2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
