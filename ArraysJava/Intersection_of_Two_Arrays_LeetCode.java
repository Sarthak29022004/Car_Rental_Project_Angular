package ArraysJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Intersection_of_Two_Arrays_LeetCode {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersection(arr1, arr2)));
    }

    static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums1) {
            map.put(i, map.getOrDefault(i, 1));
        }
        for (int i : nums2) {
            if (map.containsKey(i)) {
                map2.put(i, map2.getOrDefault(i, 0) + 1);
            }
        }
        int[] array = new int[map2.size()];
        int k = 0;
        for (int i : map2.keySet()) {
            array[k] = i;
            k++;
        }
        return array;
    }
}
