package strings;

/*
 Count Vowels - Count vowels in a given string
 Example: "Aditi Programming" -> 6 vowels
 Author: Aditi
 Time: O(n)
*/

public class CountVowels {
    public static void main(String[] args) {
        String str = "Aditi Programming";
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        System.out.println("Vowels: " + count);
    }
}

