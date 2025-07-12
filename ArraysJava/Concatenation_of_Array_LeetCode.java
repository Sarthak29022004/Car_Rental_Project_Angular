package ArraysJava;

import java.util.Arrays;

public class Concatenation_of_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[n + i] = nums[i];
        }
        return ans;
    }
}
