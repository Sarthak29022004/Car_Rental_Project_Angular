package Maths_DSA;

public class Difference_Between_Element_Sum_and_Digit_Sum_of_an_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,15,6,3};
        System.out.println(differenceOfSum(arr));
    }

    static int differenceOfSum(int[] nums) {
        int elmSum = 0;
        int digSum = 0;
        for (int num : nums) {
            elmSum += num;
        }
        for (int num : nums) {
            if (num > 9) {
                while (num > 0) {
                    digSum += num % 10;
                    num = num / 10;
                }
            } else {
                digSum += num;
            }
        }
        int ans = Math.abs(elmSum - digSum);
        return ans;
    }
}
