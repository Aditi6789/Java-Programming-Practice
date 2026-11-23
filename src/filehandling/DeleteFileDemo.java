package filehandling;

import java.io.File;
import java.io.IOException;

/*
 * Delete File Demo - Demonstrates how to delete a file using File class
 * Example: new File("demo.txt").delete()
 * Author: Aditi
 * Time: O(1)
 * Type: 1. File class 2. delete() / exists() methods
 */

public class DeleteFileDemo {
    public static void main(String[] args) {
        try {
            File myFile = new File("demo.txt");
            if (myFile.delete()) {
                System.out.println("Deleted the file: " + myFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
