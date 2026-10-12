package arrays;

/*
 FindDuplicatesInArray - Finds duplicate elements in array
 Example: [1, 2, 3, 2, 4, 3] -> duplicates: 2, 3
 Author : Aditi
*/

public class FindDuplicatesInArray {

    public static void findDuplicates(int[] arr) {
        System.out.print("Duplicate elements: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break; // ek baar print karke break
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6};
        findDuplicates(arr);
    }
}
