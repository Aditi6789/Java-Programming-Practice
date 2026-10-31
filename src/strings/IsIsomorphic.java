package strings;

import java.util.HashMap;

/*
 Isomorphic Strings - Check if two strings are isomorphic
 Example: s="egg", t="add" -> true, s="foo", t="bar" -> false
 Author: Aditi
 Time: O(n) where n=length of string
*/

public class IsIsomorphic { // Aditi6789

    public static void main(String[] args) { // Aditi6789
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) { // 1 usage Aditi6789
        if (s.length() != t.length()) return false;
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Boolean> used = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) return false;
            } else {
                if (used.containsKey(c2)) return false;
                map.put(c1, c2);
                used.put(c2, true);
            }
        }
        return true;
    }
}
