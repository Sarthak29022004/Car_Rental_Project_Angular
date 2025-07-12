package HashMaps_Java;

import java.util.HashMap;

public class hashmapDemo2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] nums = {0, 1, 2, 3, 4, 5, 6, 7, 18, 19, 4, 22, 20, 44, 55, 6, 77};
        for (int i = 0; i < nums.length - 1; i++) {
            int diff=nums[i] - nums[i + 1];
            map.getOrDefault(i,diff);
//                map.put(i,nums[i];
//            System.out.println(map.getOrDefault(i,0)+i);
        }
    }
}
