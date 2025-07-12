package ArraysJava2;

public class Count_Subarrays_of_Length_Three_With_a_Condition_LeetCode {
    public static void main(String[] args) {
        int[] arr = {-1,-4,-1,4};
        System.out.println(countSubarrays(arr));
    }
    static int countSubarrays(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            if ((float) (nums[i] + nums[i + 2]) == (float)nums[i + 1] / 2) {
                ans++;
            }
        }
        return ans;
    }
}
