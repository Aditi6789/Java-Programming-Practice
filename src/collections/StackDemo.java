package collections;

import java.util.Stack;

/**
 * Stack Demo - Demonstrates LIFO using Stack
 * Example: Browser Back History - Last visited page comes back first
 * Author: Aditi
 * Time Complexity: O(1) for push, pop, peek
 * Concepts Covered: 1. push 2. pop 3. peek 4. isEmpty 5. search
 */
public class StackDemo {
    public static void main(String[] args) {

        // 1. Create Stack - LIFO (Last In First Out)
        Stack<String> history = new Stack<>();

        // 2. Push pages
        history.push("home.html");
        history.push("courses.html");
        history.push("dsa.html");
        history.push("collections.html");

        System.out.println("Stack: " + history);

        // 3. Peek - Current page
        System.out.println("Current Page: " + history.peek());

        // 4. Pop - Go back
        System.out.println("Going Back from: " + history.pop());
        System.out.println("Now on: " + history.peek());

        // 5. Search and check
        System.out.println("Is 'home.html' in stack? Position: " + history.search("home.html"));
        System.out.println("Is stack empty? " + history.isEmpty());

        System.out.println("Final History: " + history);
    }
}