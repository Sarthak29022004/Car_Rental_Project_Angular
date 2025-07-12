package ArraysJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(containsDuplicate(arr));
    }
    static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for (int key:map.keySet()){
            if (map.get(key)>=2){
                return true;
            }
        }
//        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if (entry.getValue()>=2){
//                return true;
//            }
//        }
        return false;
    }
}
