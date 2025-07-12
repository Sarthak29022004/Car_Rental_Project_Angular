package HashMaps_Java;

import java.util.Arrays;
import java.util.HashMap;

public class Find_Missing_and_Repeated_Values_LeetCode {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 1, 7},
                {8, 9, 2},
                {3, 4, 6}
        };
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));
    }

    static int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = grid.length;
        for (int[] nums : grid) {
            for (int num : nums) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }
        int repeat = 0;
        int dupli = 0;
        int c = 0;
        for (int i = 1; i <= len * len; i++) {
            if (!map.containsKey(i)) {
                dupli = i;
                c++;
            }
            if (map.containsKey(i) && map.get(i) == 2) {
                repeat = i;
                c++;
            }
            if (c==2){
                break;
            }
        }
        return new int[]{repeat, dupli};
    }

//    static int[] findMissingAndRepeatedValues(int[][] grid) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        int len = grid.length + 1;
//        for (int[] nums : grid) {
//            for (int num : nums) {
//                map.put(num, map.getOrDefault(num, 0) + 1);
//            }
//        }
//        int repeat = 0;
//        for (int key : map.keySet()) {
//            if (map.get(key) == 2) {
//                repeat = key;
//                break;
//            }
//        }
//        int dupli = 0;
//        for (int i = 1; i <= len * len; i++) {
//            if (!map.containsKey(i)) {
//                dupli = i;
//                break;
//            }
//        }
//        return new int[]{repeat, dupli};
//    }
}
