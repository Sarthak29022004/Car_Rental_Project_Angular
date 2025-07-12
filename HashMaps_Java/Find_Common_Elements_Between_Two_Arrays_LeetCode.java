package HashMaps_Java;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Common_Elements_Between_Two_Arrays_LeetCode {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 2};
        int[] nums2 = {1, 2};
        System.out.println(Arrays.toString(findIntersectionValues(nums1, nums2)));
    }

    public static int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap();
        HashMap<Integer, Integer> map2 = new HashMap();
        int n1 = nums1.length;
        int n2 = nums2.length;
        for (int i = 0; i < n1; i++) {
            map.put(nums1[i], i);
        }
        for (int i = 0; i < n2; i++) {
            map2.put(nums2[i], i);
        }
        int return1 = 0;
        int return2 = 0;
        for (int i = 0; i < n1; i++) {
            if (map2.containsKey(nums1[i])){
                return1++;
            }
        }
        for (int i = 0; i < n2; i++) {
            if (map.containsKey(nums2[i])){
                return2++;
            }
        }
        return new int[] {return1,return2};
    }
}
