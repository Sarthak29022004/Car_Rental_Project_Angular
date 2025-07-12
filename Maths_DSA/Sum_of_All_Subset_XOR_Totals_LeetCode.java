package Maths_DSA;

public class Sum_of_All_Subset_XOR_Totals_LeetCode {
    public static void main(String[] args) {
        int[] arr = {5,1,6};
        System.out.println(subsetXORSum(arr));
    }

    static int subsetXORSum(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                ans = ans + nums[i] ^ nums[j];
            }
        }
        return ans;
    }
}
