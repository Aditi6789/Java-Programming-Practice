package java8features;

/*
 * Stream API Demo - Demonstrates filter, map and collect
 * Example: List -> Filter Even Numbers -> Square -> Print
 * Author: Aditi
 * Time: O(n)
 * Type: 1. Stream API 2. Lambda Expression
 */

public class StreamAPIDemo {
    public static void main(String[] args) {
        java.util.List<Integer> numbers = java.util.Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 1. Filter - sirf even numbers
        System.out.print("Even Numbers: ");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        // 2. Map - har number ka square
        System.out.print("Square: ");
        numbers.stream()
                .map(n -> n * n)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();

        // 3. Filter + Map + Collect - even ka square list me
        java.util.List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .collect(java.util.stream.Collectors.toList());

        System.out.println("Even Square List: " + result);

        // 4. Count - 5 se bade kitne hai
        long count = numbers.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println("Count > 5: " + count);
    }
}