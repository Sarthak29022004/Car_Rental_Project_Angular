package HashMaps_Java;

import java.util.Arrays;
import java.util.HashMap;

public class Find_the_Prefix_Common_Array_of_Two_Arrays_LeetCode {
    public static void main(String[] args) {
        int[] A = {1, 3, 2, 4};
        int[] B = {3, 1, 2, 4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }

    static int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            map.put(B[i], map.getOrDefault(B[i], 0) + 1);
            int c = 0;
            for (int j = 0; j <= i; j++) {
                if (map.get(A[j]) == 2) {
                    c++;
                }
            }
            ans[i] = c;
        }
        return ans;
    }
}
