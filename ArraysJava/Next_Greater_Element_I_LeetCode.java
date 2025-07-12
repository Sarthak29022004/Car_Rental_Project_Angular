package ArraysJava;

import java.util.Arrays;

public class Next_Greater_Element_I_LeetCode {
    public static void main(String[] args) {
        int[] arr1 = {0};
        int[] arr2 = {0};
        System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));
    }

    static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int c = 0;
            for (int j = 0; j < nums2.length; j++) {
                if (c == 1 && nums1[i] < nums2[j]) {
                    ans[i] = nums2[j];
                    break;
                }
                if (nums2[j] == nums1[i]) {
                    c = 1;
                    ans[i] = -1;
                }
                else ans[i] = -1;
            }
        }
        return ans;
    }
}
