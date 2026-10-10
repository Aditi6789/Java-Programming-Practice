package arrays;

/*
 SmallestElement - Finds smallest element in array
 Example: [1, 5, 2, 9, 3] -> 1
 Author : Aditi
 Date: 10-10-2026
*/

public class SmallestElement {

    public static int findSmallest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 9, 3, 6};
        int smallest = findSmallest(arr);
        System.out.println("Smallest element: " + smallest);
    }
}
