package arrays;

/*
 FindMissingNumber - Finds missing number from 1 to n
 Example: [1, 2, 4, 5] -> n=5 -> 3
 Author : Aditi
*/

public class FindMissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return expectedSum - sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6;
        int missing = findMissingNumber(arr, n);
        System.out.println("Missing Number: " + missing);
    }
}