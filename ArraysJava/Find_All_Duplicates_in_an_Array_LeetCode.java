package ArraysJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Duplicates_in_an_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,1,2};
        System.out.println(findDuplicates(arr));
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                list.add(key);
            }
        }
        return list;
    }
}
