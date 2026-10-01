package basics;
/**
 * VariablesDemo - Shows real-world use of variables.
 * Author: Aditi Jain (Aditi6789)
 * Use-case: Employee/Student profile demo
 */
public class VariablesDemo {
   public static void main(String[] args) {

       // Initialize variables with meaningful data
       int age = 21;
       String name = "Aditi";
       double salary = 99000.99;
       boolean isStudent = true;
       char grade = 'A';

       System.out.println("---Variables Demo---");
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("Grade: " + grade);
       System.out.println("Is Student : " + isStudent);
       System.out.println("Salary: " + salary);

       //Variables update example
       age = age + 1;
       System.out.println("Next year age will be: " + age);
    }
}
