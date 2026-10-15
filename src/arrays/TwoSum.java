package arrays;

/*
 Two Sum - Find indices of two numbers that add up to target
 Example: [2, 7, 11, 15], target=9 -> [0,1] because 2+7=9
 Author: Aditi
 Time: O(n)
*/
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            int need = target - a[i];
            if (map.containsKey(need)) {
                System.out.println("Indices: " + map.get(need) + ", " + i);
                return;
            }
            map.put(a[i], i);
        }
    }
}
