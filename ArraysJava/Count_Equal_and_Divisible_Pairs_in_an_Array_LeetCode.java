package ArraysJava;

public class Count_Equal_and_Divisible_Pairs_in_an_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(countPairs(arr, 1));
    }

    static int countPairs(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int i = 0;
        int j = 1;
        while (i < n) {
            if (j >= n) break;
            if (nums[i] == nums[j] && i * j % k == 0) {
                ans++;
            }
            if (j == n - 1) {
                i++;
                j = i + 1;
            } else {
                j++;
            }
        }
        return ans;
    }
}
