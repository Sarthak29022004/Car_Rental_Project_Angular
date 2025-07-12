package HashMaps_Java;

import java.util.Arrays;

public class Find_Subsequence_of_Length_K_With_the_Largest_Sum_LeetCode {
    public static void main(String[] args) {
        int[] arr = {-1,-2,3,4};
        System.out.println(Arrays.toString(maxSubsequence(arr,3)));
    }
    static int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];
        Arrays.sort(nums);
        for (int i = nums.length - 1; i < nums.length; i--) {
            k--;
            ans[k] = nums[i];
            if (k==0) break;
        }
        return ans;
    }
}
