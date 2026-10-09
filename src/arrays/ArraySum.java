package arrays;

/*
 ArraySum - Calculates sum of array elements
 Author : Aditi
 Date: 09-10-2026
*/

public class ArraySum {

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = calculateSum(arr);
        System.out.println("Sum: " + result);
    }
}
