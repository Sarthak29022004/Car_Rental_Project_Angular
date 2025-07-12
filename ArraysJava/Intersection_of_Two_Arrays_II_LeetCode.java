package ArraysJava;

import java.util.*;

public class Intersection_of_Two_Arrays_II_LeetCode {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        intersect(arr1, arr2);
    }

    static int[] intersect(int[] nums1, int[] nums2) {
        int[] nums1Array = new int[1001];
        for (int i : nums1)
            nums1Array[i]++;
        int size = 0;
        for (int i : nums2) {
            if (nums1Array[i] > 0) {
                nums1[size++] = i;
                nums1Array[i]--;
            }
        }
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = nums1[i];
        }
        return res;
    }
}
