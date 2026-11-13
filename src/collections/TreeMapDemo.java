package collections;

import java.util.TreeMap;

/**
 * TreeMap Demo - Demonstrates Sorted Key-Value collection using TreeMap
 * Example: Location -> Accessibility Score sorted by Location Name
 * Author: Aditi
 * Time Complexity: O(log n) for put, get, remove
 * Concepts Covered: 1. put 2. get 3. firstKey 4. lastKey 5. higherKey 6. lowerKey 7. remove 8. Iteration
 */
public class TreeMapDemo {
    public static void main(String[] args) {

        // 1. Create TreeMap - Sorted by Key + No Duplicate Key
        TreeMap<String, Integer> locationScores = new TreeMap<>();

        // 2. Insert elements
        locationScores.put("Library", 85);
        locationScores.put("Park", 70);
        locationScores.put("Hospital", 95);
        locationScores.put("School", 50);
        locationScores.put("Park", 80); // Duplicate Key - purani value overwrite ho jayegi

        System.out.println("Scores: " + locationScores);

        // 3. Retrieve - First and Last Key (Alphabetically Smallest & Largest)
        System.out.println("First Location: " + locationScores.firstKey());
        System.out.println("Last Location: " + locationScores.lastKey());

        // 4. Higher and Lower Key
        System.out.println("Higher than Hospital: " + locationScores.higherKey("Hospital"));
        System.out.println("Lower than Hospital: " + locationScores.lowerKey("Hospital"));

        // 5. Get value by Key
        System.out.println("Score of School: " + locationScores.get("School"));

        // 6. Remove
        locationScores.remove("School");
        System.out.println("After Remove: " + locationScores);

        // 7. Iteration
        System.out.println("All Locations:");
        for (String location : locationScores.keySet()) {
            System.out.println(location + " -> " + locationScores.get(location));
        }
    }
}