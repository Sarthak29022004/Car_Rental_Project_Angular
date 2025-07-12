package ArraysJava;

import java.util.HashMap;

public class Contains_Duplicate_2_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3};
        System.out.println(containsNearbyDuplicate(arr, 2));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(map.containsKey(val) && i - map.get(val) <= k) {
                return true;
            }
            map.put(val,i);
        }
        return false;
    }
}
