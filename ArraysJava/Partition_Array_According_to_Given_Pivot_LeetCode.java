package ArraysJava;

import java.util.ArrayList;
import java.util.Arrays;

public class Partition_Array_According_to_Given_Pivot_LeetCode {
    public static void main(String[] args) {
        int[] arr = {9, 12, 5, 10, 14, 3, 10};
        System.out.println(Arrays.toString(pivotArray(arr, 10)));
    }

    static int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] less = new int[n];
        int[] greater = new int[n];
        int[] ans = new int[n];
        int l = 0;
        int e = 0;
        int g = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] < pivot) less[l++] = nums[i];
            else if (nums[i] > pivot) greater[g++] = nums[i];
            else e++;
        }
        int index = 0;
        for (int i = 0; i < l; i++) {
            ans[index++] = less[i];
        }
        for (int i = 0; i < e; i++) {
            ans[index++] = pivot;
        }
        for (int i = 0; i < g; i++) {
            ans[index++] = greater[i];
        }
        return ans;
    }

//    static int[] pivotArray(int[] nums, int pivot) {
//        ArrayList<Integer> mainList = new ArrayList<>();
//        ArrayList<Integer> equalList = new ArrayList<>();
//        ArrayList<Integer> greaterList = new ArrayList<>();
//
//        int len = nums.length;
//
//        for (int i = 0; i < len / 2; i++) {
//            if (nums[i] < pivot) {
//                mainList.add(nums[i]);
//            } else if (nums[i] > pivot) {
//                greaterList.add(nums[i]);
//            } else if (nums[i] == pivot) {
//                equalList.add(nums[i]);
//            }
//            if (nums[len - 1 - i] < pivot) {
//                mainList.add(nums[len - 1 - i]);
//            } else if (nums[len - 1 - i] > pivot) {
//                greaterList.add(nums[len - 1 - i]);
//            } else if (nums[len - 1 - i] == pivot) {
//                equalList.add(nums[len - 1 - i]);
//            }
//        }
//        for (int num : nums) {
//            if (num < pivot) {
//                mainList.add(num);
//            } else if (num > pivot) {
//                greaterList.add(num);
//            } else {
//                equalList.add(num);
//            }
//        }
//        mainList.addAll(equalList);
//        mainList.addAll(greaterList);
//        return mainList.stream().mapToInt(i -> i).toArray();
//    }
}
