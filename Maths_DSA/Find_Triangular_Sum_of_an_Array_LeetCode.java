package Maths_DSA;

public class Find_Triangular_Sum_of_an_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(triangularSum(arr));
    }

    static int triangularSum(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < nums.length; i++) {
            int ind = 0;
            while (ind < len - 1) {
                nums[ind] = (nums[ind] + nums[ind + 1]) % 10;
                ind++;
            }
            len--;
        }
        return nums[0];
    }
}
