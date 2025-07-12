package Recursion;

public class find_the_array_is_sorted_ascending_or_not {
    public static void main(String[] args) {
        int[] arr = {17, 18, 9, 11, 12, 13, 14, 15, 16};
        System.out.println(check(arr, 0, arr.length - 1,0));
    }

    static boolean check(int[] nums, int s, int e, int count) {
        if (count > 1) {
            return false;
        }
        if (s == e) {
            return true;
        }
        if (nums[s] > nums[s + 1]) {
            count += 1;
        }
        return check(nums, s + 1, e,count);
    }
}
