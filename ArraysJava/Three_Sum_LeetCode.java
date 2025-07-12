package ArraysJava;

import java.util.ArrayList;
import java.util.List;

public class Three_Sum_LeetCode {
    public static void main(String[] args) {
        int[] ar = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(ar));
    }
//it's incomplete solve it
    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
//                        int[] arr = {nums[i], nums[j], nums[k]};
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        list.add(list1);
                    }
                }
            }
        }
        return list;
    }
}
