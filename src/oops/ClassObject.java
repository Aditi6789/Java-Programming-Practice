package oops;

public class ClassObject {
    public static void main(String[] args) {

        Student s1 = new Student(23, "Aditi");
        Student s2 = new Student(52, "Rahul");

        System.out.println(s1.getRollNo() + " - " + s1.getName());
        System.out.println(s2.getRollNo() + " - " + s2.getName());

        s1.setName("Aditi Jain Updated");
        System.out.println("After update: " + s1.getName());
    }
}

class Student {
    private int rollNo;
    private String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
