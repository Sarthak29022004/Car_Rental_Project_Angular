package ArraysJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array_LeetCode {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));  //[5, 6]
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) list.add(i);
        }
        return list;
    }
}
