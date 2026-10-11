package arrays;

/*
 CheckIfSorted - Checks if array is sorted in ascending order
 Example: [1, 2, 3, 4] -> true, [1, 3, 2] -> false
 Author : Aditi
*/

public class CheckIfSorted {

    public static boolean checkIfSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 2, 4};

        System.out.println("Array 1 is sorted: " + checkIfSorted(arr1));
        System.out.println("Array 2 is sorted: " + checkIfSorted(arr2));
    }
}