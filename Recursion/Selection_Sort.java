package Recursion;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 7, 1};
        selection(arr, 0, arr.length - 1, 1);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] nums, int s, int e, int max) {
        if (e == 0) return;
        if (s < e) {
            if (nums[s] > nums[max]) {
                max = s;
                int temp = nums[max];
                nums[max] = nums[e];
                nums[e] = temp;
            }
            selection(nums, s + 1, e, s);
        } else {
            selection(nums, 0, e - 1, 1);
        }
    }
}
