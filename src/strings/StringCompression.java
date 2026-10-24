package strings;

import java.util.*;

/*
 String Compression - Compress string ex: aabcccccaaa -> a2b1c5a3
 Example: "aaabbb" -> "a3b3"
 Author: Aditi
 Time: O(n) where n=length of string
*/

public class StringCompression {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= s.length(); i++) {
            if (i < s.length() && s.charAt(i) == s.charAt(i-1)) {
                count++;
            } else {
                compressed.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        System.out.println(compressed.toString());
    }
}

