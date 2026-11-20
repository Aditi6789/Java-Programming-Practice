package java8features;

import java.util.Optional;

/*
 * Optional Demo - Demonstrates Optional class to avoid NullPointerException
 * Example: Optional.ofNullable(null) -> orElse("Default Value")
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Optional.of / ofNullable 2. orElse / ifPresent / map
 */

public class OptionalDemo {

    public static void main(String[] args) {

        // 1. Optional.of - when value is definitely present
        Optional<String> name = Optional.of("Aditi");
        System.out.println("Name: " + name.get());

        // 2. Optional.empty - when there is no value
        Optional<String> empty = Optional.empty();
        System.out.println("Is Empty? " + empty.isEmpty());

        // 3. ofNullable - when value can be null, this is the best one
        String city = null;
        Optional<String> cityOpt = Optional.ofNullable(city);
        System.out.println("City: " + cityOpt.orElse("Sagar")); // if null, return Sagar

        // 4. orElseGet - when default value comes from a method
        String college = null;
        String result = Optional.ofNullable(college)
                .orElseGet(() -> "BTIRT, Sagar");
        System.out.println("College: " + result);

        // 5. isPresent + ifPresent - instead of if-else
        Optional<String> skill = Optional.of("Java");
        if (skill.isPresent()) {
            System.out.println("Skill is present: " + skill.get());
        }
        skill.ifPresent(s -> System.out.println("ifPresent: " + s.toUpperCase()));

        // 6. map - to perform operation on the value
        Optional<String> upper = Optional.of("aditi")
                .map(s -> s.toUpperCase());
        System.out.println("Upper: " + upper.get());

        // 7. filter - to check a condition
        Optional<String> filtered = Optional.of("Aditi Jain")
                .filter(s -> s.length() > 5);
        System.out.println("Filter pass? " + filtered.isPresent());

        // 8. orElseThrow - throw error if value is not present
        try {
            String value = Optional.ofNullable(null)
                    .orElseThrow(() -> new RuntimeException("Value not found!")).toString();
            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}