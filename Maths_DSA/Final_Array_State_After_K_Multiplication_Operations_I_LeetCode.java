package Maths_DSA;

import java.util.Arrays;

public class Final_Array_State_After_K_Multiplication_Operations_I_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(Arrays.toString(getFinalState(arr, 3, 4)));
    }

    static int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int min = nums[0];
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }
}
