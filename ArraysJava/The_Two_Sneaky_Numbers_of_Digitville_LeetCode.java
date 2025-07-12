package ArraysJava;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class The_Two_Sneaky_Numbers_of_Digitville_LeetCode {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2};
        System.out.println(Arrays.toString(getSneakyNumbers(arr)));
    }

    static int[] getSneakyNumbers(int[] nums) {
        int a = 0;
        int b = 0;
        int c = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    if (c == 0) {
                        b = nums[i];
                        c++;
                    } else {
                        a = nums[i];
                    }
                }
            }
        }
//        for (int i = 0; i < n; i++) {
//            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() == 2) {
//                if (c == 1) {
//                    b = entry.getKey();
//                } else {
//                    a = entry.getKey();
//                    c++;
//                }
//            }
//        }
//        int c = 0;
//        for (int key : map.keySet()) {
//            if (map.get(key) > 1) {
//                if (c == 0) {
//                    a = key;
//                    c++;
//                } else {
//                    b = key;
//                }
//            }
//        }
        return new int[]{a, b};
    }
}
