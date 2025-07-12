package ArraysJava2;

public class Zero_Array_Transformation_I_LeetCode {
    public static void main(String[] args) {
        int[] nums = {1, 0, 1};
        int[][] queries = {
                {0, 2}
        };
        System.out.println(isZeroArray(nums, queries));
    }

    public static boolean isZeroArray(int[] nums, int[][] queries) {
        int n = queries.length;
        int i = 0;
        while (i < n) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (nums[j] > 0) {
                    nums[j] = nums[j] - 1;
                }
            }
            i++;
        }
        for (int num : nums) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
