package collections;

import java.util.HashSet;
import java.util.Set;

/**
 * HashSet Demo - Demonstrates Unique collection using HashSet
 * Example: Unique reported locations, no duplicates, add, contains, removal
 * Author: Aditi
 * Time Complexity: O(1) average for add, contains, remove. O(n) for search.
 * Concepts Covered: 1. add 2. contains 3. remove 4. size 5. iteration 6. isEmpty
 */

public class HashSetDemo {

    public static void main(String[] args) {

        // 1. Create HashSet: Use Set interface - Industry Best Practice
        Set<String> reportedLocations = new HashSet<>();

        // 2. Insert elements using add()
        reportedLocations.add("Gohad - Broken Footpath");
        reportedLocations.add("Gwalior - No Ramp");
        reportedLocations.add("ITM College Gate");
        reportedLocations.add("Gohad - Broken Footpath"); // Duplicate - add nahi hoga

        System.out.println("Set: " + reportedLocations);

        // 3. Retrieve check using contains()
        System.out.println("Contains Gwalior? : " + reportedLocations.contains("Gwalior - No Ramp"));

        // 4. Update - No direct set(), remove + add karna padta hai
        reportedLocations.remove("Gwalior - No Ramp");
        reportedLocations.add("Gwalior - Ramp Fixed");
        System.out.println("After Update: " + reportedLocations);

        // 5. Remove element using remove()
        reportedLocations.remove("ITM College Gate");
        System.out.println("After Removal: " + reportedLocations);

        // 6. Iteration - For-each loop
        System.out.println("All Unique Reports:");
        for(String loc : reportedLocations) {
            System.out.println("- " + loc);
        }

        // 7. Size and isEmpty
        System.out.println("Size: " + reportedLocations.size());
        System.out.println("Is Empty? " + reportedLocations.isEmpty());
    }
}
