package collections;

import java.util.TreeSet;

/**
 * TreeSet Demo - Demonstrates Sorted Unique collection using TreeSet
 * Example: Accessibility scores sorted, unique, no duplicates - Top accessible locations
 * Author: Aditi
 * Time Complexity: O(log n) for add, remove, contains.
 * Concepts Covered: 1. add 2. first 3. last 4. higher 5. lower 6. remove 7. iteration
 */

public class TreeSetDemo {

    public static void main(String[] args) {

        // 1. Create TreeSet - Sorted + Unique
        TreeSet<Integer> accessibilityScores = new TreeSet<>();

        // 2. Insert elements
        accessibilityScores.add(85);
        accessibilityScores.add(20);
        accessibilityScores.add(95);
        accessibilityScores.add(50);
        accessibilityScores.add(85); // Duplicate - add nahi hoga

        System.out.println("Scores: " + accessibilityScores);

        // 3. Retrieve - First and Last (Lowest & Highest)
        System.out.println("Lowest Score: " + accessibilityScores.first());
        System.out.println("Highest Score: " + accessibilityScores.last());

        // 4. Higher and Lower - Next accessible option
        System.out.println("Higher than 50: " + accessibilityScores.higher(50));
        System.out.println("Lower than 50: " + accessibilityScores.lower(50));

        // 5. Remove
        accessibilityScores.remove(20);
        System.out.println("After Removal: " + accessibilityScores);

        // 6. Iteration - Sorted order
        System.out.println("All Scores Sorted:");
        for(Integer score : accessibilityScores) {
            System.out.println("-> Score: " + score);
        }

        // 7. Size and contains
        System.out.println("Size: " + accessibilityScores.size());
        System.out.println("Contains 95? " + accessibilityScores.contains(95));
    }
}