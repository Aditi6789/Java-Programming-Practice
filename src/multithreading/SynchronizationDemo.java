package multithreading;

/*
 * Synchronization Demo - Demonstrates synchronized method
 * Example: Counter -> Two Threads (race condition avoided)
 * Author: Aditi
 * Time: O(n)
 * Type: 1. Synchronized Method 2. Multithreading
 */

public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        MyThread t1 = new MyThread(c); // pehla thread
        MyThread t2 = new MyThread(c); // dusra thread

        t1.start();
        t2.start();

        t1.join(); // dono ke khatam hone ka wait
        t2.join();

        System.out.println("Final Count: " + c.count);
    }
}

class Counter {
    int count = 0;

    // synchronized - ek time pe ek hi thread andar aayega
    public synchronized void increment() {
        count++;
    }
}

class MyThread extends Thread {
    Counter counter;

    public MyThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}