package ArraysJava2;

import java.util.Arrays;

public class Sort_Colors_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,0,1};
        System.out.println(Arrays.toString(sortColors(arr)));
    }

    public static int[] sortColors(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) {
            int min = nums[i];
            int ind = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] <= min) {
                    min = nums[j];
                    ind = j;
                }
            }

            int temp = nums[i];
            nums[i] = nums[ind];
            nums[ind] = temp;
        }
        return nums;
    }
}
