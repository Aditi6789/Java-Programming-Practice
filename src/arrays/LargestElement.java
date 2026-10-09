package arrays;

/*
 LargestElement - Finds largest element in array
 Example: [1, 5, 2, 9, 3] -> 9
 Author : Aditi
 Date: 09-10-2026
*/

public class LargestElement {

    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 3, 6};
        int largest = findLargest(arr);
        System.out.println("Largest element: " + largest);
    }
}