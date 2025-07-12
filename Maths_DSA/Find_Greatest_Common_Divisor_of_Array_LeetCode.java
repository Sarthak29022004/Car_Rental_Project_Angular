package Maths_DSA;

public class Find_Greatest_Common_Divisor_of_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,5,6,9,10};
        System.out.println(findGCD(arr));
    }
    static int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        for (int i = min; i >= 1; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
