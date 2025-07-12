package ArraysJava2;

import java.util.Arrays;
import java.util.HashMap;

public class Move_Zeroes_LeetCode {
    public static void main(String[] args) {
        int[] arr = {0,2,4,0,5};
        System.out.println(Arrays.toString(moveZeroes(arr)));
    }

    static int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[c] = nums[i];
                c++;
            }
        }
        while (c < n) {
            nums[c++] = 0;
        }
        return nums;
    }
}


//            if (nums[s] == 0 && nums[e] != 0) {
//                int temp = nums[s];
//                nums[s] = nums[e];
//                nums[e] = temp;
//                s++;
//                e++;
//            } else if (nums[s] == 0 && nums[e] == 0) {
//                e++;
//            } else if (nums[s] != 0 && nums[e] == 0) {
//                s++;
//            } else if (nums[s] != 0 && nums[e] != 0) {
//                s++;
//                e++;
//            }

//        HashMap<Integer, Integer> map = new HashMap<>();
//        int n = nums.length;
//        int ind = 0;
//        int c = 0;
//        for (int i = 0; i < n; i++) {
//            if (nums[i] == 0) {
//                c++;
//            } else {
//                map.put(ind,nums[i]);
//                ind++;
//            }
//        }
//        if (c != 0) {
//            int k = 0;
//            for (int i=0;i<ind;i++) {
//                nums[k] = map.get(i);
//                k++;
//            }
//            for (int i = k; i < n; i++) {
//                nums[i] = 0;
//            }
//        }
//        return nums;