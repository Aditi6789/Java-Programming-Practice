package multithreading;

/*
 * Thread Demo - Demonstrates Multithreading using Thread Class
 * Example: Two tasks running parallelly, Playing Music & Chatting
 * Author: Aditi
 * Time: O(1)
 * Type: 1. Thread Class 2. extends Thread 3. start()
 */

public class ThreadDemo { // Aditi6789
    public static void main(String[] args) { // Aditi6789

        // 1. Thread Object Example
        MusicTask t1 = new MusicTask("Task-1: Playing Music");
        ChatTask t2 = new ChatTask("Task-2: Chatting");

        // 2. start() se Thread start karo
        t1.start();
        t2.start();

        System.out.println("Main Thread Finished!");
    }
}

class MusicTask extends Thread { // Aditi6789
    String name;

    MusicTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " - Song " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " Completed!");
    }
}

class ChatTask extends Thread { // Aditi6789
    String name;

    ChatTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " - Message " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " Completed!");
    }
}
