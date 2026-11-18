package java8features;

/*
 * Lambda Expression Demo - Demonstrates Lambda with Sorting, Thread and forEach
 * Example: Without Lambda code is long, With Lambda code is short and clean
 * Author: Aditi
 * Time: O(n log n)
 * Type: 1. Sorting with Lambda 2. Thread with Lambda 3. forEach with Lambda
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo {

    public static void main(String[] args) {

        // 1. Lambda with List Sorting
        List<String> names = new ArrayList<>();
        names.add("Aditi");
        names.add("Riya");
        names.add("Ananya");
        names.add("Priya");

        // Sort by length using Lambda
        Collections.sort(names, (s1, s2) -> s1.length() - s2.length());
        System.out.println("Sorted by Length: " + names);

        // Sort in reverse order using Lambda
        Collections.sort(names, (s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted Reverse: " + names);

        // 2. Lambda with Thread - No need for Runnable class
        Runnable task = () -> System.out.println("Thread running with Lambda");
        Thread t1 = new Thread(task);
        t1.start();

        // 3. Lambda with forEach - Print all names
        System.out.println("All Names:");
        names.forEach((name) -> System.out.println(name));

        // 4. Lambda with Filter Logic - Names starting with A
        System.out.println("Names starting with A:");
        names.forEach((name) -> {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        });
    }
}