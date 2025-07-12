package Sliding_Window;

import java.util.ArrayList;
import java.util.List;

public class First_Negative_Integer_In_Every_K_Window_Size {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        System.out.println(firstNegativeInt(arr, 3));
    }

    static List<Integer> firstNegativeInt(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i <= len - k; i++) {
            for (int j = i; j < i + k - 1; j++) {
                if (nums[j] < 0) {
                    list.add(nums[j]);
                    break;
                }
            }
        }
        return list;
    }
}
