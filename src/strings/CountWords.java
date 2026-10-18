package strings;

/*
 Count Words - Count number of words in a string
 Example: "Hello World" -> 2
 Author: Aditi
 Time: O(n)
*/

public class CountWords {
    public static void main(String[] args) {
        String str = "Hello World Aditi";
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("Word Count: " + count);
    }
}