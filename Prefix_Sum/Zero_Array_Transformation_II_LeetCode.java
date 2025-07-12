package Prefix_Sum;

public class Zero_Array_Transformation_II_LeetCode {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2};
        int[][] queries = {
                {0, 2, 1},
                {0, 2, 1},
                {1, 1, 3}
        };
        System.out.println(minZeroArray(nums, queries));
    }

    static int minZeroArray(int[] nums, int[][] queries) {
        int n = nums.length, sum = 0, k = 0;
        int[] differenceArray = new int[n + 1];
        for (int index = 0; index < n; index++) {
            while (sum + differenceArray[index] < nums[index]) {
                k++;
                if (k > queries.length) {
                    return -1;
                }
                int left = queries[k - 1][0];
                int right = queries[k - 1][1];
                int val = queries[k - 1][2];
                if (right >= index) {
                    differenceArray[Math.max(left, index)] += val;
                    differenceArray[right + 1] -= val;
                }
            }
            sum += differenceArray[index];
        }
        return k;
    }
}
