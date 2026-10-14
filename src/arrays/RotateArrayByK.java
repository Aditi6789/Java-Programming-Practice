package arrays;

/*
RotateArrayByK - Rotates an array by k positions to the right
Example: [1, 2, 3, 4, 5, 6, 7], k=3 -> [5, 6, 7, 1, 2, 3, 4]
Author : Aditi
*/

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k = k % a.length;

        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);

        for (int n : a) System.out.print(n + " ");
    }

    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
