package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ArrayDeque Demo - Demonstrates Deque using ArrayDeque
 * Example: Train reservation - add from both sides
 * Author: Aditi
 * Time Complexity: O(1) for addFirst, addLast, pollFirst
 * Concepts Covered: 1. addFirst 2. addLast 3. pollFirst 4. peek 5. Iteration
 */
public class ArrayDequeDemo {
    public static void main(String[] args) {

        // 1. Create Deque
        Deque<String> deque = new ArrayDeque<>();

        // 2. Add - Add from both ends
        deque.add("Aditi");
        deque.addFirst("First Passenger");
        deque.addLast("Last Passenger");
        deque.add("Middle Passenger");

        System.out.println("Deque: " + deque);

        // 3. Peek - See first and last
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        // 4. Poll - Remove from first
        System.out.println("Removing first: " + deque.pollFirst());
        System.out.println("Deque after poll: " + deque);

        // 5. Iteration
        for (String name : deque) {
            System.out.println("Passenger: " + name);
        }
    }
}