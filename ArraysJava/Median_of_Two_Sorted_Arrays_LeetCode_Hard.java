package ArraysJava;

import java.util.Arrays;

public class Median_of_Two_Sorted_Arrays_LeetCode_Hard {
    public static void main(String[] args) {
        int[] arr1 = {2,2,4,4};
        int[] arr2 = {2,2,2,4,4};
        System.out.println(findMedianSortedArrays(arr1, arr2));   //2.00000
    }

    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double store = 0;
        int[] ar = new int[nums1.length + nums2.length];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            ar[k] = nums1[i];
            k++;
        }
        for (int i = 0; i < nums2.length; i++) {
            ar[k] = nums2[i];
            k++;
        }
//        System.arraycopy(nums1, 0, ar, 0, nums1.length);
//        System.arraycopy(nums2, 0, ar, nums1.length, nums2.length);
        Arrays.sort(ar);

        int start = 0;
        int end = ar.length - 1;
        int mid = start + (end - start) / 2;
        if (ar.length % 2 == 0) {
            store += ar[mid] + ar[mid + 1];
        }
        else {
            return ar[mid];
        }
        store = store / 2;
        return store;
    }
}


//for (int i = 0; i < nums1.length; i++) {
//store += nums1[i];
//        }
//        for (int i = 0; i < nums2.length; i++) {
//store += nums2[i];
//        }
//store = store / (nums1.length + nums2.length);