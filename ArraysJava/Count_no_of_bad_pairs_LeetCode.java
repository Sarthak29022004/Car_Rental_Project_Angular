package ArraysJava;

import java.util.HashMap;

public class Count_no_of_bad_pairs_LeetCode {
    public static void main(String[] args) {
        int[] nums = {4, 1, 3, 3};
        System.out.println(countBadPairs(nums));
    }

    static long countBadPairs(int[] nums) {
        HashMap<Integer, Integer> store = new HashMap<>();
        long good = 0;
        for (int i = 0; i < nums.length; i++) {
            int diff = nums[i] - i;

            if (store.containsKey(diff)) {
                good += store.get(diff);
            }
            store.put(diff, store.getOrDefault(diff, 0) + 1);
        }
        return (long) nums.length * (nums.length - 1) / 2 - good;  //formula
    }
}
//====================  Time Complexity is much High =========================
// long count = 0;
// for (int i = 0; i < nums.length - 1; i++) {
//     for (int j = i + 1; j < nums.length; j++) {
//         if (i < j && j - i != nums[j] - nums[i]) {
//             count++;
//         }
//     }
// }
// return count;


//HashMap<Integer, Integer> freq = new HashMap<>();
//long good = 0;
//        for (int i = 0; i < nums.length; i++) {
//int key = nums[i] - i;
//good += freq.getOrDefault(key, 0);
//            freq.put(key, freq.getOrDefault(key, 0) + 1);
//        }
//        return (long) nums.length * (nums.length - 1) / 2 - good;  //formula