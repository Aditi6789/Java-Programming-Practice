package arrays;

/*
 MoveZerosToEnd - Moves all zeros to end keeping order of non-zero elements
 Example: [0, 1, 0, 3, 12] -> [1, 3, 12, 0, 0]
 Author : Aditi
*/

public class MoveZerosToEnd {

    public static void moveZeros(int[] arr) {
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};

        System.out.print("Original Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        moveZeros(arr);

        System.out.print("\nAfter Moving Zeros: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
