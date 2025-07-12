package ArraysJava;

import java.util.HashMap;
import java.util.Map;

public class Best_time_to_buy_and_sell_share_LeetCode {
    public static void main(String[] args) {
        int[] nums = {7,1,5,3,6,4};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int i = 0; i < nums.length; i++) {
            for (Map.Entry<Integer,Integer> entry : map.entrySet()){
                if (nums[i]-entry.getKey()>max){
                    max=nums[i]-entry.getKey();
                }
            }
        }
        return max;
    }
}
