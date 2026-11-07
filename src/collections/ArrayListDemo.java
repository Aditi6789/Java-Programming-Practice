package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ArrayList Demo - Demonstrates Dynamic Array using ArrayList
 * Example: Student names with dynamic size, insertion, retrieval, update, removal and sorting
 * Author: Aditi
 * Time Complexity: O(1) average for get, add at end. O(n) for remove and search.
 * Concepts Covered: 1. add 2. get 3. set 4. contains 5. remove 6. sort 7. iteration
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        // 1. Create ArrayList: Use List interface - Industry Best Practice
        List<String> names = new ArrayList<>();

        // 2. Insert elements using add()
        names.add("Aditi");
        names.add("Priya");
        names.add("Ritu");
        names.add("Anu");

        System.out.println("List: " + names);

        // 3. Retrieve element using get()
        System.out.println("Element at index 0: " + names.get(0));

        // 4. Update element using set()
        names.set(1, "Priya Mam");
        System.out.println("After Update: " + names);

        // 5. Get total size
        System.out.println("Total Size: " + names.size());

        // 6. Check element existence using contains()
        System.out.println("Contains Aditi? " + names.contains("Aditi"));

        // 7. Remove element by value
        names.remove("Anu");
        System.out.println("After Removal: " + names);

        // 8. Iterate using Enhanced For Loop - Best Practice
        System.out.println("\n--- Iterating ArrayList ---");
        for (String name : names) {
            System.out.println(name);
        }

        // 9. Sort using Collections.sort()
        Collections.sort(names);
        System.out.println("\nAfter Sorting: " + names);

        // 10. Clear check
        System.out.println("Is List Empty? " + names.isEmpty());
    }
}