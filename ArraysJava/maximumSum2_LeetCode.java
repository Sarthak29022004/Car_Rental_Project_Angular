package ArraysJava;

public class maximumSum2_LeetCode {
    public static void main(String[] args) {
        int[] nums = {10, 12, 19, 14};
        System.out.println(maximumSum(nums));
    }

    static int maximumSum(int[] nums) {
        //The answer is right but time complexity is too high
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            int max_i = 0;
            int a = nums[i];
            while (a > 0) {
                int rem = a % 10;
                max_i = max_i + rem;
                a = a / 10;
            }
            for (int j = 0; j < nums.length; j++) {
                int max_j = 0;
                if (j != i) {
                    int b = nums[j];
                    while (b > 0) {
                        int rem = b % 10;
                        max_j = max_j + rem;
                        b = b / 10;
                    }
                }
                if (max_i == max_j) {
                    int m = nums[i] + nums[j];
                    if (m > max) {
                        max = m;
                    }
                }
            }
        }
        return max;
    }
}
