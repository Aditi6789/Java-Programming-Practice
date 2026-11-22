package filehandling;

import java.io.File;

/*
 * File Info Demo - Demonstrates how to get information of a file
 * Example: file.getName(), file.length(), file.canRead()
 * Author: Aditi
 * Time: O(1)
 * Type: 1. File class 2. getName(), getAbsolutePath(), length() method
 */

public class FileInfoDemo {
    public static void main(String[] args) {
        File file = new File("demo.txt");

        if (file.exists()) {
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
