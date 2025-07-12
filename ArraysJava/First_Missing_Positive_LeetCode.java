package ArraysJava;

import java.util.HashMap;

public class First_Missing_Positive_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = 0;
        int n = nums.length;
        for (int i : nums) {
            if (i > m) m = i;
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int max = Math.max(m + 1, n);
        for (int i = 1; i <= max; i++) {
            if (!map.containsKey(i)) return i;
        }
        return 0;
    }
}
