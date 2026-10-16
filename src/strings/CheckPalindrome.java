package strings;

/*
 Check Palindrome - Check if string reads same forward and backward
 Example: "madam" -> true, "Aditi" -> false
 Author: Aditi
 Time: O(n)
*/

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println(str + " is Palindrome");
        } else {
            System.out.println(str + " is Not Palindrome");
        }
    }
}