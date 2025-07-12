package Maths_DSA;

import java.util.HashMap;

public class Count_Largest_Group_LeetCode {
    public static void main(String[] args) {
        System.out.println(countLargestGroup(2));
    }

    static int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < n + 1; i++) {
            int num = i;
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        int maxVal = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > maxVal) {
                maxVal = map.get(key);
            }
        }
        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == maxVal) {
                ans++;
            }
        }
        return ans;
    }
}
