package arrays;

/*
 AverageOfArray - Finds average of array elements
 Example: [1, 5, 2, 9, 3] -> 4.0
 Author : Aditi
 Date: 10-10-2026
*/

public class AverageOfArray {

    public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 3, 6};
        double avg = findAverage(arr);
        System.out.println("Average: " + avg);
    }
}
