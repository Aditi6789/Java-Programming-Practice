package filehandling;

import java.io.FileWriter;
import java.io.IOException;

/*
 * Write File Demo - Demonstrates how to write data into a file
 * Example: FileWriter.write("Hello Aditi")
 * Author: Aditi
 * Time: O(n)
 * Type: 1. FileWriter class 2. write() and close() method
 */

public class WriteFileDemo {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("demo.txt");
            writer.write("Hello Aditi! This is File Handling in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}