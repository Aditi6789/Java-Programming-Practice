package strings;

import java.util.Stack;

/*
 Valid Parentheses - Check if brackets are balanced
 Example: "()[]{}" -> true, "(]" -> false
 Author: Aditi
 Time: O(n)
*/

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "()[]{}";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {
                    isValid = false;
                    break;
                }
            }
        }

        if (!stack.isEmpty()) isValid = false;

        System.out.println("Is Valid: " + isValid);
    }
}
