package arrays;

/*
 SecondLargestElement - Finds second largest element
 Example: [1, 5, 2, 9, 3, 6] -> 6
 Author : Aditi
 Date: 10-10-2026
*/

public class SecondLargestElement {

    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 3, 6};
        int result = findSecondLargest(arr);
        System.out.println("Second Largest: " + result);
    }
}