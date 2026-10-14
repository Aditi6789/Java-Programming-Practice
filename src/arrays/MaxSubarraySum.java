package arrays;

/*
MaxSubarraySum - Finds maximum sum of contiguous subarray (Kadane's Algorithm)
Example: [-2, 1, -3, 4, -1, 2, 1, -5, 4] -> 6 (subarray [4, -1, 2, 1])
Author : Aditi
*/
public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int currentSum = a[0];
        int maxSum = a[0];

        for (int i = 1; i < a.length; i++) {
            if (currentSum + a[i] < a[i]) currentSum = a[i];
            else currentSum = currentSum + a[i];

            if (currentSum > maxSum) maxSum = currentSum;
        }
        System.out.print(maxSum);
    }
}
