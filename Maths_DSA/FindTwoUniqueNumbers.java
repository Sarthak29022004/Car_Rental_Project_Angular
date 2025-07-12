package Maths_DSA;

import java.util.Arrays;

public class FindTwoUniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2, 5};
        System.out.println(Arrays.toString(findSingleNumbers(nums)));
    }

    public static int[] findSingleNumbers(int[] nums) {
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int rightmostSetBit = xor & (-xor);
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & rightmostSetBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }
        return new int[]{num1, num2};
    }
}
