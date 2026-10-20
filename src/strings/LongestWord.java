package strings;

/*
 Longest Word - Find the longest word in a given string
 Example: "Hello World Aditi" -> "Hello" (5)
 Author: Aditi
 Time: O(n)
*/

public class LongestWord {
    public static void main(String[] args) {
        String str = "Hello World Aditi";
        String longest = "";

        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.println("Longest Word: " + longest);
    }
}
