package multithreading;

/*
 * Runnable Demo - Demonstrates Multithreading using Runnable Interface
 * Example: Two tasks running parallely, Downloading & Uploading
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Runnable 2. Thread 3. start()
 */

public class RunnableDemo { // Aditi6789
    public static void main(String[] args) { // Aditi6789
        // 1. Runnable Object Example
        MyTask t1 = new MyTask("Task-1: Downloading");
        MyTask t2 = new MyTask("Task-2: Uploading");

        // 2. Thread Object me Runnable pass karo
        Thread th1 = new Thread(t1, "Downloader-Thread");
        Thread th2 = new Thread(t2, "Uploader-Thread");

        // 3. start() se run() call hoga
        th1.start();
        th2.start();

        System.out.println("Main Thread Finished!");
    }
}

class MyTask implements Runnable { // Aditi6789
    String taskName;

    MyTask(String name) {
        this.taskName = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(taskName + " - Count: " + i + " | Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(taskName + " interrupted");
            }
        }
        System.out.println(taskName + " Finished!");
    }
}