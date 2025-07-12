package Recursion;

import java.util.ArrayList;

public class Find_element_in_array {
    public static void main(String[] args) {
        int[] arr = {19, 20, 2, 3, 4, 5, 6, 14, 18};
        System.out.println(find(arr, 0, 5));      //5th index
        System.out.println(find2(arr, 0, 5));     //true
        int[] ar = {19, 20, 2, 3, 4, 5, 5, 5, 6, 14, 18};
        ArrayList<Integer> ans = findBoth(ar, 0, 5, new ArrayList<>());
        System.out.println(ans);   //[5, 6, 7]
    }

    static int find(int[] nums, int s, int target) {
        if (s == nums.length) return -1;
        if (nums[s] == target) return s;
        return find(nums, s + 1, target);
    }

    static boolean find2(int[] nums, int s, int target) {
        if (s == nums.length) return false;
        return nums[s] == target || find2(nums, s + 1, target);
    }

//    findBoth(ar, 0, 5, new ArrayList<>());
    static ArrayList findBoth(int[] nums, int s, int target, ArrayList<Integer> list) {
        if (s == nums.length) return list;
        if (nums[s] == target) list.add(s);
        return findBoth(nums, s + 1, target, list);
    }
}
