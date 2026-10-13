package arrays;
import java.util.HashMap;

/*
 FrequencyCount - Counts frequency of each element in array
 Example: [1, 2, 2, 3, 1] -> 1=2 times, 2=2 times
 Author : Aditi
*/

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
