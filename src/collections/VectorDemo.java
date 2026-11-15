package collections;

import java.util.Vector;

/**
 * Vector Demo - Demonstrates dynamic array with thread-safety
 * Example: To-do list - Old version of ArrayList
 * Author: Aditi
 * Time Complexity: O(1) for add, O(n) for search
 * Concepts Covered: 1. add 2. get 3. remove 4. firstElement 5. Iteration
 */
public class VectorDemo {
    public static void main(String[] args) {

        // 1. Create Vector - Dynamic array (Thread-safe)
        Vector<String> todoList = new Vector<>();

        // 2. Add - Add tasks to list
        todoList.add("Learn Java");
        todoList.add("Practice DSA");
        todoList.add("Revise Collections");
        todoList.add("Solve LeetCode");

        System.out.println("Vector: " + todoList);

        // 3. Get - See task at index
        System.out.println("Task at 0: " + todoList.get(0));

        // 4. First & Last - Special methods of Vector
        System.out.println("First Task: " + todoList.firstElement());
        System.out.println("Last Task: " + todoList.lastElement());
        System.out.println("Capacity: " + todoList.capacity());

        // 5. Remove - Remove task
        System.out.println("Removing: " + todoList.remove(1));
        System.out.println("Vector after remove: " + todoList);

        // 6. Iteration
        for (String task : todoList) {
            System.out.println("Task: " + task);
        }
    }
}