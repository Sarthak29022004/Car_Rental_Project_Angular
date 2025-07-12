package ArraysJava;

public class MinimumOperationstoExceedThresholdValueII_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2, 11, 10, 1, 3};
        System.out.println(minOperations(arr, 10));
    }

    static int minOperations(int[] nums, int k) {
        int count = 0;
        int min1 = 0, min2 = 0;
        if (nums[0] < nums[1]) {
            min1 = nums[0];
            min2 = nums[1];
        } else {
            min1 = nums[1];
            min2 = nums[0];
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == min1) {
                min1 = nums[i];
            } else if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        int min = min1 * 2 + min2;


        System.out.println(min1 + "  " + min2);
        return count;
    }
}
