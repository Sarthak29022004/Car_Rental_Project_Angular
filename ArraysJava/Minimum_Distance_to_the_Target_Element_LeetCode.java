package ArraysJava;

public class Minimum_Distance_to_the_Target_Element_LeetCode {
    public static void main(String[] args) {

    }

    static int getMinDistance(int[] nums, int target, int start) {
        int len = nums.length;
        int ind = Integer.MAX_VALUE;
        for (int i = start; i < len; i++) {
            if (nums[i] == target) {
                ind = i;
                break;
            }
        }
        int ind2 = Integer.MAX_VALUE;
        for (int i = start; i >= 0; i--) {
            if (nums[i] == target) {
                ind2 = i;
                break;
            }
        }
        int ans = Math.abs(ind - start);
        int ans2 = Math.abs(ind2 - start);
        int res = Math.min(ans, ans2);
        return res;
    }
}
