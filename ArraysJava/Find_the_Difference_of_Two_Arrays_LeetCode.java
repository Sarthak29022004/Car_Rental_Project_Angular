package ArraysJava;

import java.util.*;

public class Find_the_Difference_of_Two_Arrays_LeetCode {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 3};
        int[] num2 = {1, 1, 2, 2};
        System.out.println(findDifference(num1, num2));
    }

    static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            set2.add(i);
        }
        for (int num : set1) {
            if (!set2.contains(num)) list1.add(num);
        }
        for (int num : set2) {
            if (!set1.contains(num)) list2.add(num);
        }
        list.add(list1);
        list.add(list2);
        return list;
    }

//        List<List<Integer>> list = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        HashMap<Integer, Integer> map = new HashMap<>();
//        HashMap<Integer, Integer> map2 = new HashMap<>();
//        for (int i : nums1) {
//            map.put(i, map.getOrDefault(i, 1));
//        }
//        for (int i : nums2) {
//            if (!map.containsKey(i) && !list1.contains(i)) {
//                list1.add(i);
//            }
//            map2.put(i, map2.getOrDefault(i, 1));
//        }
//        for (int i : nums1) {
//            if (!map2.containsKey(i) && !list2.contains(i)) {
//                list2.add(i);
//            }
//        }
//        list.add(list2);
//        list.add(list1);
//        return list;
//    }
}
