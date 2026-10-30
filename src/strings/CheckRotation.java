package strings;

/*
 Check Rotation - Check if one string is rotation of another
 Example: s1="ABCD", s2="CDAB" -> true, s1="ABCD", s2="ACBD" -> false
 Author: Aditi
 Time: O(n) where n=length of string
*/

public class CheckRotation { // Aditi6789

    public static void main(String[] args) { // Aditi6789
        String s1 = "ABCD";
        String s2 = "CDAB";
        System.out.println(isRotation(s1, s2));
    }

    public static boolean isRotation(String s1, String s2) { // 1 usage Aditi6789
        if (s1.length() != s2.length()) return false;
        String temp = s1 + s1;
        return temp.contains(s2);
    }
}
