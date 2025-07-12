package Maths_DSA;

import java.util.Arrays;

public class Minimum_Sum_of_Four_Digit_Number_After_Splitting_Digits_LeetCode {
    public static void main(String[] args) {
        System.out.println(minimumSum(1111));
    }

    static int minimumSum(int num) {
        int[] arr = new int[4];
        int number = Integer.MAX_VALUE;
        int val = 0;
//        int n = num;
        int index = 0;
        while (num > 0) {
            int res = num % 10;
            arr[index] = res;
            index++;
            if (res < number) {
                number = res;
                val = 1;
            } else if (res == number) {
                val++;
            }
            num = num / 10;
        }
        Arrays.sort(arr);
        int ans = 0;
        if (val == 1 || val == 2) {
            ans = (arr[0] * 10 + arr[2]) + (arr[1] * 10 + arr[3]);
            return ans;
        } else {
            ans = (arr[0] * 10 + arr[1]) + (arr[2] * 10 + arr[3]);
        }
        return ans;
    }
}
// 1234    46    37