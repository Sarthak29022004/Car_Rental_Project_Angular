package ArraysJava;

import java.util.Arrays;

public class Sort_Array_By_Parity_LeetCode {
    public static void main(String[] args) {
        int[] arr = {3,2};
        System.out.println(Arrays.toString(sortArrayByParity(arr)));
    }

    static int[] sortArrayByParity(int[] nums) {
        int[] ans = new int[nums.length];
        int e = 0;
        int o = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[e] = nums[i];
                e++;
            } else {
                ans[(nums.length - 1) - o] = nums[i];
                o++;
            }
        }
        return ans;
    }
}
