package arrays;

/*
 RemoveDuplicates - Removes duplicates from sorted array
 Example: [1, 1, 2, 2, 3] -> [1, 2, 3]
 Author : Aditi
*/

public class RemoveDuplicates {

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }

        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!= arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4};

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        int newLength = removeDuplicates(arr);

        System.out.print("\nAfter Removing Duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
