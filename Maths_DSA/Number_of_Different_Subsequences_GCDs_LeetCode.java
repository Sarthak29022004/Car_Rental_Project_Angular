package Maths_DSA;

import java.util.HashSet;

public class Number_of_Different_Subsequences_GCDs_LeetCode {
    public static void main(String[] args) {
        int[] arr = {6,10,3};
        System.out.println(countDifferentSubsequenceGCDs(arr));
    }

    static int countDifferentSubsequenceGCDs(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println(set);
        return ans;
    }
}
