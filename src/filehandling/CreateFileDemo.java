package filehandling;

import java.io.File;
import java.io.IOException;

/*
 * Create File Demo - Demonstrates how to create a new file using File class
 * Example: new File("demo.txt").createNewFile()
 * Author: Aditi
 * Time: O(1)
 * Type: 1. File class 2. createNewFile() method
 */

public class CreateFileDemo {
    public static void main(String[] args) {
        try {
            File myFile = new File("demo.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created: " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}