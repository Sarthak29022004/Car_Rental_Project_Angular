package ArraysJava;

import java.util.ArrayList;
import java.util.List;

public class Permutations_LeetCode {
    public static void main(String[] args) {
        int[] arr = {0,1};
        System.out.println(permute(arr));
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        int c = 0;
        while (c < nums.length) {
            for (int i = 0; i < nums.length; i++) {
                list1.add(nums[i]);
            }
            c++;
            list.add(list1);
        }
        return list;
    }
}
