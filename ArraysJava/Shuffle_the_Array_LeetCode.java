package ArraysJava;

import java.util.Arrays;

public class Shuffle_the_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};
        System.out.println(Arrays.toString(shuffle(arr, 2)));
    }

    static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[n * 2];
        int j = 0;
        int k = 1;
        for (int i = 0; i < n; i++) {
            ans[j] = nums[i];
            ans[k] = nums[n + i];
            j += 2;
            k += 2;
        }
        return ans;
    }
}
