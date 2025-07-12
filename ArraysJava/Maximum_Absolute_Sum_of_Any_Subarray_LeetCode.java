package ArraysJava;

public class Maximum_Absolute_Sum_of_Any_Subarray_LeetCode {
    public static void main(String[] args) {
        int[] arr = {};
        System.out.println(maxAbsoluteSum(arr));
    }

    static int maxAbsoluteSum(int[] nums) {
        int max = Math.abs(nums[0]);
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int subArrSum = 0;
            for (int j = i; j < n; j++) {
                subArrSum += nums[j];
                if (Math.abs(subArrSum) > max) {
                    max = Math.abs(subArrSum);
                }
            }
        }
        return max;
    }
}
