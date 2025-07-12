package ArraysJava;

public class findDuplicate_LeetCode {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(nums));
    }

    static int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] seen = new boolean[n];
        for (int num : nums) {
            if (seen[num]) {
                return num;
            }
            seen[num] = true;
        }
        return 0;
    }
}
