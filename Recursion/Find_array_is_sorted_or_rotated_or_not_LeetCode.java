package Recursion;

public class Find_array_is_sorted_or_rotated_or_not_LeetCode {
    public static void main(String[] args) {
        int[] arr = {19, 20, 2, 3, 4, 5, 6, 14, 18};
        System.out.println(check(arr, 0, 0));
    }

    static boolean check(int[] nums, int s, int c) {
        if (s == nums.length) return true;
        if (nums[s] > nums[((s + 1) % nums.length)]) {
            c += 1;
            if (c > 1) return false;
        }
        return check(nums, s + 1, c);
    }
}
