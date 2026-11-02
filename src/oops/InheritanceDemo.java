package oops;

public class InheritanceDemo {
    public static void main(String[] args) {
        Person person = new Person("Rahul", 25);
        System.out.println("--- Person Details ---");
        person.DisplayInfo();

        System.out.println("-----------------");

        Students student = new Students("Aditi", 20, 101);
        System.out.println("--- Students Details (Inheritance) ---");
        student.DisplayInfo();
    }
}

class Person {
    protected String name;
    protected int age;

    public Person(String name , int age){
        this.name = name;
        this.age = age;
    }
    public void DisplayInfo(){
        System.out.println("Name : " + name );
        System.out.println("Age : " + age);
    }
}

class Students extends Person {
    int rollNo;

    public Students(String name, int age, int rollNo) {
        super(name, age); // Parent constructor ko call
        this.rollNo = rollNo;
    }

    @Override
    public void DisplayInfo() {
        super.DisplayInfo(); // Parent ka method
        System.out.println("Roll No : " + rollNo);
    }
}