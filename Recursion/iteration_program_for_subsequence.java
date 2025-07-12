package Recursion;

import java.util.ArrayList;
import java.util.List;

public class iteration_program_for_subsequence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> ans = subsequence(nums);
        System.out.println(ans);    //[[], [1], [2], [1, 2], [3], [1, 3], [2, 3], [1, 2, 3]]
    }

    static List<List<Integer>> subsequence(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());   //[[]]  add []
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i));  //get copy of ith element of outer
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }
}
