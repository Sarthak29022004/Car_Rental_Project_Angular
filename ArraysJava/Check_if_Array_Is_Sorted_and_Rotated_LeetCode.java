package ArraysJava;

public class Check_if_Array_Is_Sorted_and_Rotated_LeetCode {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        System.out.println(check(nums));
    }

    static boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
