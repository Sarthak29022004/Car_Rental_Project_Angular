package HashMaps_Java;

import java.util.*;

public class Most_Frequent_Even_Element_LeetCode {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,4,4,1};
        System.out.println(mostFrequentEven(arr));
    }

    static int mostFrequentEven(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) map.put(n,map.getOrDefault(n,0)+1);
        }
        int max = -1;
        int res = -1;
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (freq > max || (freq == max && key < res)) {
                max = freq;
                res = key;
            }
        }
        return res;
    }
}