package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Queue Demo - Demonstrates FIFO using ArrayDeque
 * Example: Print Queue - First document prints first
 * Author: Aditi
 * Time Complexity: O(1) for offer, poll, peek
 * Concepts Covered: 1. offer 2. poll 3. peek 4. isEmpty 5. Iteration
 */
public class QueueDemo {
    public static void main(String[] args) {

        // 1. Create Queue - FIFO (First In First Out)
        Deque<String> printQueue = new ArrayDeque<>();

        // 2. Offer - Add jobs to queue
        printQueue.offer("Resume.pdf");
        printQueue.offer("Assignment.pdf");
        printQueue.offer("Report.pdf");
        printQueue.offer("Certificate.pdf");

        System.out.println("Queue: " + printQueue);

        // 3. Peek - See next job without removing
        System.out.println("Next to Print: " + printQueue.peek());

        // 4. Poll - Print and remove first job
        System.out.println("Printing: " + printQueue.poll());
        System.out.println("Queue after print: " + printQueue);

        // 5. Check remaining
        System.out.println("Is queue empty? " + printQueue.isEmpty());

        System.out.println("Remaining jobs:");
        for (String job : printQueue) {
            System.out.println(job);
        }
    }
}
