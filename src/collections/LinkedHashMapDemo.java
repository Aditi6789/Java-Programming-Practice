package collections;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LinkedHashMap Demo - Demonstrates Map with insertion order
 * Example: Student roll number management - maintains order
 * Author: Aditi
 * Time Complexity: O(1) for put, get, remove
 * Concepts Covered: 1. put 2. get 3. remove 4. containsKey 5. Iteration order
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {

        // 1. Create LinkedHashMap
        LinkedHashMap<Integer, String> studentMap = new LinkedHashMap<>();

        // 2. Add - Add entries
        studentMap.put(101, "Aditi");
        studentMap.put(102, "Riya");
        studentMap.put(103, "Aman");
        studentMap.put(104, "First Year Student");

        System.out.println("Map: " + studentMap);

        // 3. Get - Get value by key
        System.out.println("Get 102: " + studentMap.get(102));

        // 4. Contains - Check key
        System.out.println("Contains 101? " + studentMap.containsKey(101));

        // 5. Iteration - Maintains insertion order
        System.out.println("Iterating in insertion order:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 6. Remove - Remove entry
        System.out.println("Removing 104: " + studentMap.remove(104));
        System.out.println("After remove: " + studentMap);
    }
}