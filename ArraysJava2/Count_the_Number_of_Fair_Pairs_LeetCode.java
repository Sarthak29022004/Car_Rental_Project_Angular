package ArraysJava2;

import java.util.Arrays;

public class Count_the_Number_of_Fair_Pairs_LeetCode {
    public static void main(String[] args) {
        int[] arr = {0,1,7,4,4,5};
        System.out.println(countFairPairs(arr,3,6));
    }
    static long countFairPairs(int[] nums, int lower, int upper) {
        return count(nums, upper) - count(nums, lower - 1);
    }
    static long count(int[] nums, int target) {
        long res = 0;
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > target) right--;
            else res += right - left++;
        }
        return res;
    }
}
