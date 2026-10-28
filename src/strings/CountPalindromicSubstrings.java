package strings;

/*
 Count Palindromic Substrings - Count total palindromic substrings in a string
 Example: s="aaa" -> 6 (a, a, a, aa, aa, aaa), s="abc" -> 3 (a, b, c)
 Author: Aditi
 Time: O(n^2) where n=length of string
*/

public class CountPalindromicSubstrings {

    public static void main(String[] args) {
        String s = "aaa";
        System.out.println(countSubstrings(s));
    }

    public static int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // odd length palindrome
            count += expandAroundCenter(s, i, i);
            // even length palindrome
            count += expandAroundCenter(s, i, i + 1);
        }

        return count;
    }

    public static int expandAroundCenter(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
