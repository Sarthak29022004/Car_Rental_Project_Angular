package HashMaps_Java;

import java.util.HashMap;

public class Divide_Array_Into_Equal_Pairs_LeetCode {
    public static void main(String[] args) {
        int[] arr = {3,2,3,2,2,2};
        System.out.println(divideArray(arr));
    }

    static boolean divideArray(int[] nums) {
        int sum = 0;
        for (int num: nums){
            sum ^= num;
        }
        if (sum!=0) return false;
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (int num : map.keySet()) {
//            if (map.get(num)%2!=0) return false;
//        }
        return true;
    }
}
