package strings;

/*
 Reverse Words In Sentence - Reverse words order in a sentence
 Example: s="I love Java" -> "Java love I", s="Hello World" -> "World Hello"
 Author: Aditi
 Time: O(n) where n=length of string
*/

public class ReverseWordsInSentence { // Aditi6789

    public static void main(String[] args) { // Aditi6789
        String s = "I love Java";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) { // 1 usage Aditi6789
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}
