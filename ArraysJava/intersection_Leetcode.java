package ArraysJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class intersection_Leetcode {
    public static void main(String[] args) {
        int[] num1={1,2,2,1};
        int[] num2={2,2};
        System.out.println(Arrays.toString(intersection(num1,num2)));
    }
    static int[] intersection(int[] nums1, int[] nums2) {
        int[] num3=new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:nums1){
            map.put(i,map.getOrDefault(i,0)+0);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int j=0;
            for (int i:nums2){
                if(entry.getKey()==i){
                    num3[j]=i;
                    j++;
                }
            }
        }
        return num3;
    }
}
