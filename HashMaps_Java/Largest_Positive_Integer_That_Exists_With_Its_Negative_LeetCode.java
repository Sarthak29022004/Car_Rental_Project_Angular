package HashMaps_Java;

import java.util.HashMap;

public class Largest_Positive_Integer_That_Exists_With_Its_Negative_LeetCode {
    public static void main(String[] args) {
        int[] arr = {-1,10,6,7,-7,1};
        System.out.println(findMaxK(arr));
    }

    static int findMaxK(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int max = 0;
        for(int key:map.keySet()){
            if(key<0){
                int val = 0 - key;
                if(map.containsKey(val) && val > max){
                    max = val;
                }
            } else {
                int val = 0 - key;
                if(map.containsKey(val) && key > max){
                    max = key;
                }
            }
        }
        if(max!=0){
            return max;
        }
        return -1;
    }
}
