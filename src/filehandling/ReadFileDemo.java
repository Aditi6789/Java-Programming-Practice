package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Read File Demo - Demonstrates how to read a file using File and Scanner class
 * Example: new Scanner(new File("demo.txt"))
 * Author: Aditi
 * Time: O(n)
 * Type: 1. File class 2. Scanner class 3. hasNextLine() / nextLine() methods
 */

public class ReadFileDemo {
    public static void main(String[] args) {
        try {
            File myFile = new File("demo.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
