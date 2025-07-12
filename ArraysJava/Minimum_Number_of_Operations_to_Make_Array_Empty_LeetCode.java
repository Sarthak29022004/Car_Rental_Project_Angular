package ArraysJava;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations_to_Make_Array_Empty_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2, 2, 4, 2, 3, 4};
        System.out.println(minOperations(arr));
        System.out.println(minOperations2(arr));
    }

    static int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int store = 0;
        for (int key : map.keySet()) {
            int val = map.get(key);
            if (val == 1) return -1;
            else {
                while (val > 0) {
                    val -= 3;
                    store++;
                }
            }
        }
        return store;
    }

    static int minOperations2(int[] nums) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            int c = entry.getValue();
            if (c == 1) return -1;
            res += (int) Math.ceil((double) c / 3);
        }
        return res;
    }
}


//        System.out.println(Math.ceil((double) 3 /3));   //1
//        System.out.println(Math.ceil((double) 4 /3));   //2
//        System.out.println(Math.ceil((double) 5 /3));   //2
//        System.out.println(Math.ceil((double) 6 /3));   //2
//        System.out.println(Math.ceil((double) 7 /3));   //3
//        System.out.println(Math.ceil((double) 8 /3));   //3
//        System.out.println(Math.ceil((double) 9 /3));   //3