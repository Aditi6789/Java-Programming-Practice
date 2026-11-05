package oops;

class StudentData {
    String name;
    int roll;
    static String college = "Sagar College";

    static {
        System.out.println("Static Block: College = " + college);
    }

    StudentData() {
        this("Unknown", 0);
        System.out.println("Default Constructor called");
    }

    StudentData(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Parameterized Constructor: " + name);
    }

    StudentData(StudentData other) {
        this.name = other.name;
        this.roll = other.roll;
    }
    void display() {
        System.out.println("Roll: " + roll + ", Name: " + name);
    }
}

public class ConstructorChainingDemo {
    public static void main(String[] args) {
        StudentData s1 = new StudentData();
        StudentData s2 = new StudentData("Aditi", 101);
        s2.display();
        StudentData s3 = new StudentData(s2);
        s3.display();
    }
}