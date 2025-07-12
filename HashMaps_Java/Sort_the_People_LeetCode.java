package HashMaps_Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Sort_the_People_LeetCode {
    public static void main(String[] args) {
        String[] arr = {"Mary", "John", "Emma"};
        int[] ar = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(arr, ar)));
    }

    static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < heights.length; i++) {
            map.put(heights[i], names[i]);
        }
        String[] ans = new String[names.length];
        Arrays.sort(heights);
        int i = heights.length - 1;
        for (int num : heights) {
            ans[i] = map.get(num);
            i--;
        }
        return ans;
    }
}
