package HashMaps_Java;

import java.util.HashMap;

public class Keep_Multiplying_Found_Values_by_Two_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,7,9};
        System.out.println(findFinalValue(arr, 4));
    }

    static int findFinalValue(int[] nums, int original) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 1);
        }
        while(map.containsKey(original)){
            original *= 2;
        }
        return original;
    }
}
