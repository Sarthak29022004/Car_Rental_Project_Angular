package ArraysJava;

import java.util.Arrays;

public class Apply_Operations_to_an_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(Arrays.toString(applyOperations(arr)));
    }

    static int[] applyOperations(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int c = 0;
        int s = 0;
        int[] ar = new int[n];
        for (int num : nums) {
            if (num != 0) {
                ar[s] = num;
                s++;
            } else {
                ar[n - 1 - c] = 0;
                c++;
            }
        }
        return ar;
    }
}
