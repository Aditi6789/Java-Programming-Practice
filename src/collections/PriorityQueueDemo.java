package collections;

import java.util.PriorityQueue;

/**
 * PriorityQueue Demo - Demonstrates Min-Heap using PriorityQueue
 * Example: Accessibility Scores - Smallest score always stays on top
 * Author: Aditi
 * Time Complexity: O(log n) for offer, poll, remove
 * Concepts Covered: 1. offer 2. peek 3. poll 4. remove 5. Iteration
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {

        // 1. Create PriorityQueue - By default, Min-Heap is created
        PriorityQueue<Integer> scores = new PriorityQueue<>();

        // 2. Insert elements
        scores.offer(85);
        scores.offer(70);
        scores.offer(95);
        scores.offer(50);

        System.out.println("Queue: " + scores);

        // 3. Peek - View the top element without removing it
        System.out.println("Top Score (Smallest): " + scores.peek());

        // 4. Poll - Remove the top element
        System.out.println("Removed: " + scores.poll());
        System.out.println("After Poll: " + scores);
        System.out.println("New Top: " + scores.peek());

        // 5. Remove a specific element
        scores.remove(95);
        System.out.println("After Remove 95: " + scores);
    }
}