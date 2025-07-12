package ArraysJava;

public class Minimum_Element_After_Replacement_With_Digit_Sum_LeetCode {
    public static void main(String[] args) {
        int[] nums = {999,19,199};
        System.out.println(minElement(nums));
    }

    public static int minElement(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int val = 0;
            int num = nums[i];
            while (num != 0) {
                val = val + num % 10;
                num = num / 10;
            }
            arr[i] = val;
        }
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
