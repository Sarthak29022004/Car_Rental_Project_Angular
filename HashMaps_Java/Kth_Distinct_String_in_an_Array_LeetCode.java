package HashMaps_Java;

import java.util.HashMap;

public class Kth_Distinct_String_in_an_Array_LeetCode {
    public static void main(String[] args) {
        String[] str = {"a","b","a"};
        System.out.println(kthDistinct(str, 3));
    }

    static String kthDistinct(String[] arr, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int val = 0;
        for (String key : arr) {
            if (map.get(key) == 1) {
                val++;
            }
            if (val == k && map.get(key) == 1) {
                return key;
            }
        }
        return "";
    }
}
