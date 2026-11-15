package collections;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet Demo - Demonstrates Set with insertion order + uniqueness
 * Example: Course enrollment - no duplicate courses, order maintained
 * Author: Aditi
 * Time Complexity: O(1) for add, remove, contains
 * Concepts Covered: 1. add 2. remove 3. contains 4. size 5. Iteration order
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {

        // 1. Create LinkedHashSet
        LinkedHashSet<String> courses = new LinkedHashSet<>();

        // 2. Add - Add elements
        courses.add("Java");
        courses.add("DSA");
        courses.add("Collections");
        courses.add("OOPS");
        courses.add("Java"); // Duplicate

        System.out.println("Courses: " + courses);

        // 3. Contains - Check element
        System.out.println("Contains DSA? " + courses.contains("DSA"));

        // 4. Size - Number of elements
        System.out.println("Size: " + courses.size());

        // 5. Iteration - Maintains insertion order
        System.out.println("Iterating in insertion order:");
        for (String course : courses) {
            System.out.println(course);
        }

        // 6. Remove - Remove element
        courses.remove("OOPS");
        System.out.println("After remove: " + courses);
    }
}