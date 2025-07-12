package Recursion;

import java.util.ArrayList;

public class find_elements_in_array_using_arrayList {
    public static void main(String[] args) {
        int[] ar = {19, 20, 2, 3, 4, 5, 5, 5, 6, 14, 18};
        ArrayList<Integer> l = find(ar,5,0);
        System.out.println(l);    //[5, 6, 7]
    }

    static ArrayList<Integer> find(int[] nums, int target, int i) {
        ArrayList<Integer> list = new ArrayList<>();
        if (i == nums.length) return list;
        if (nums[i] == target) list.add(i);
        ArrayList<Integer> ansFromBelowCalls = find(nums, target, i + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
