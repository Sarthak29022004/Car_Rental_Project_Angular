package ArraysJava;

import java.util.HashMap;

public class Contains_Duplicate_3_LeetCode {
    public static void main(String[] args) {
        int[] arr = {8,7,15,1,6,1,9,15};
        System.out.println(containsNearbyAlmostDuplicate(arr, 1, 3));
    }

    static boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (map.containsKey(val)) {
                if (i != map.get(val) && Math.abs(i - map.get(val)) <= indexDiff && Math.abs(nums[i] - nums[map.get(val)]) <= valueDiff) {
                    return true;
                }
            }
            map.put(val, i);
        }
        return false;
    }
}
