package Recursion;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubble(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] nums, int s, int e) {
        if (e == 0) return;
        if (s < e) {
            if (nums[s] > nums[s + 1]) {
                int temp = nums[s];
                nums[s] = nums[s + 1];
                nums[s + 1] = temp;
            }
            bubble(nums, s + 1, e);
        } else {
            bubble(nums, 0, e - 1);
        }
    }
}
