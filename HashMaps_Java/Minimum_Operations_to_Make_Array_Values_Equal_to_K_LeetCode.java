package HashMaps_Java;

import java.util.HashMap;
import java.util.HashSet;

public class Minimum_Operations_to_Make_Array_Values_Equal_to_K_LeetCode {
    public static void main(String[] args) {
        int[] arr = {5, 2, 5, 4, 5};
        System.out.println(minOperations(arr, 2));
    }

    static int minOperations(int[] nums, int k) {
        HashSet<Integer> map = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            if (num < k) {
                return -1;
            }
            if (num > k && !map.contains(num)) {
                map.add(num);
                ans++;
            }
        }
        return ans;
    }
}
