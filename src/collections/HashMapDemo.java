package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap Demo - Demonstrates Key-Value Storage using HashMap
 * Example: Student ID mapped to Student Name, fast lookup by key
 * Author: Aditi
 * Time Complexity: O(1) average for put, get, remove
 * Concepts Covered: 1. put 2. get 3. containsKey 4. remove 5. iteration
 */
public class HashMapDemo {

    public static void main(String[] args) {

        // 1. Create HashMap: Key = Student ID (Integer), Value = Student Name (String)
        Map<Integer, String> students = new HashMap<>();

        // 2. Insert entries using put()
        students.put(101, "Aditi");
        students.put(102, "Priya");
        students.put(103, "Ritu");
        students.put(104, "Anu");

        System.out.println("Student Map: " + students);

        // 3. Retrieve value using get()
        System.out.println("Student with ID 101: " + students.get(101));

        // 4. Update value for existing key
        students.put(102, "Priya Mam");
        System.out.println("After Update: " + students);

        // 5. Check key and value existence
        System.out.println("Contains Key 103? " + students.containsKey(103));
        System.out.println("Contains Value Aditi? " + students.containsValue("Aditi"));

        // 6. Get total size
        System.out.println("Total Students: " + students.size());

        // 7. Remove entry by key
        students.remove(104);
        System.out.println("After Removal: " + students);

        // 8. Iterate using entrySet() - Best Practice
        System.out.println("\n--- Iterating HashMap ---");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " | Name: " + entry.getValue());
        }

        // 9. Iterate using keySet()
        System.out.println("\n--- Student IDs Only ---");
        for (Integer id : students.keySet()) {
            System.out.println(id);
        }
    }
}