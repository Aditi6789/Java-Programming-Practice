package strings;

import java.util.*;

/*
 Group Anagrams - Group anagrams together from array of strings
 Example: ["eat","tea","tan","ate","nat","bat"] -> [["eat","tea","ate"], ["bat"], ["tan","nat"]]
 Author: Aditi
 Time: O(n*k log k) where n=number of strings, k=max string length
*/

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // sort string to make key - eat -> aet
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // if key not present, create new list
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        // print groups
        System.out.println("Grouped Anagrams: ");
        for (List<String> group : map.values()) {
            System.out.println(group);
        }
    }
}