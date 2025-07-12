package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subsequence_with_duplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> ans = subsequenceDuplicate(nums);
        System.out.println(ans);    //[[], [1], [2], [1, 2], [2, 2], [1, 2, 2]]
    }

    static List<List<Integer>> subsequenceDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());   //[[]]  add []
        int start;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;
            }
            end = outer.size() - 1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> inner = new ArrayList<>(outer.get(j));  //get copy of ith element of outer
                inner.add(arr[i]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
