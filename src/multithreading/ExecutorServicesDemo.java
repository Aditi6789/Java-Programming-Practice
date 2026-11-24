package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/*
 * ExecutorService Demo - Demonstrates Multithreading using ExecutorService
 * Example: 3 Tasks running parallelly, Cab Booking, Food Order & Payment
 * Author: Aditi
 * Time: O(1)
 * Type: 1. ExecutorService 2. FixedThreadPool 3. submit()
 */

public class ExecutorServicesDemo { // Aditi6789
    public static void main(String[] args) { // Aditi6789

        // 1. ExecutorService Object Example
        ExecutorService executor = Executors.newFixedThreadPool(3);

        OrderTask t1 = new OrderTask("Task-1: Cab Booking");
        OrderTask t2 = new OrderTask("Task-2: Food Order");
        OrderTask t3 = new OrderTask("Task-3: Payment");

        // 2. submit() se Task Executor ko do
        executor.submit(t1);
        executor.submit(t2);
        executor.submit(t3);

        // 3. shutdown() se Executor band karo
        executor.shutdown();

        try {
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main Thread Finished!");
    }
}

class OrderTask implements Runnable { // Aditi6789
    String name;

    OrderTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(name + " - Step " + i + " by " + Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " Completed!");
    }
}