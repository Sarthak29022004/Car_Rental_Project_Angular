//2342. Max Sum of a Pair With Equal Sum of Digits
//        You are given a 0-indexed array nums consisting of positive integers. You can choose two indices i and j, such that i != j, and the sum of digits of the number nums[i] is equal to that of nums[j].
//        Return the maximum value of nums[i] + nums[j] that you can obtain over all possible indices i and j that satisfy the conditions.
//        Example 1:
//        Input: nums = [18,43,36,13,7]
//        Output: 54
//        Explanation: The pairs (i, j) that satisfy the conditions are:
//        - (0, 2), both numbers have a sum of digits equal to 9, and their sum is 18 + 36 = 54.
//        - (1, 4), both numbers have a sum of digits equal to 7, and their sum is 43 + 7 = 50.
//        So the maximum sum that we can obtain is 54.
//        Example 2:
//        Input: nums = [10,12,19,14]
//        Output: -1
//        Explanation: There are no two numbers that satisfy the conditions, so we return -1.


package ArraysJava;

import java.util.HashMap;
import java.util.Map;

public class maximumSum_LeetCode {
    public static void main(String[] args) {
        int[] nums = {18, 43, 36, 13, 7};
        System.out.println(maximumSum(nums));
    }

    static int maximumSum(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int res = -1;

        for (int num : nums) {
            int key = digitSum(num);
            if (freq.containsKey(key)) {
                res = Math.max(res, freq.get(key) + num);
                freq.put(key, Math.max(freq.get(key), num));
            } else {
                freq.put(key, num);
            }
        }

        return res;
    }

    static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
//        //The answer is right but time complexity is too high
//        int max = -1;
//        for (int i = 0; i < nums.length; i++) {
//            int max_i = 0;
//            int a = nums[i];
//            while (a > 0) {
//                max_i += a % 10;
//                a /= 10;
//            }
//            for (int j = 0; j < nums.length; j++) {
//                int max_j = 0;
//                if (j != i) {
//                    int b = nums[j];
//                    while (b > 0) {
//                        max_j += b % 10;
//                        b /= 10;
//                    }
//                }
//                if (max_i == max_j) {
//                    int m = nums[i] + nums[j];
//                    if (m > max) {
//                        max = m;
//                    }
//                }
//            }
//        }
//        return max;
//    }

