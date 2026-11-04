package oops;

/*
 * Encapsulation Demo - Demonstrates Data Hiding using private + getter/setter
 * Example: Student data private, access via public methods
 * Author: Aditi
 * Time: O(1)
 * Type: 1. private variables 2. public getter/setter
 */

public class EncapsulationDemo {
    public static void main(String[] args) { // Aditi6789
        // 1. Encapsulation Example
        StudentEncap s1 = new StudentEncap("Aditi", 20);
        System.out.println(s1.getName());
        s1.setAge(21);
        System.out.println("Updated Age: " + s1.getAge());
    }
}

class StudentEncap {
    private String name;
    private int age;

    public StudentEncap(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter
    public void setAge(int age) {
        if(age > 0) {
            this.age = age;
        }
    }
}
