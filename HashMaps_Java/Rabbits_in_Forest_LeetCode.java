package HashMaps_Java;

import java.util.HashMap;
import java.util.HashSet;

public class Rabbits_in_Forest_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1};
        System.out.println(numRabbits(arr));
    }

    static int numRabbits(int[] answers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : answers) {
            if (num == 0) {
                ans++;
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > num + 1) {
                    ans += num + 1;
                    map.put(num, 1);
                }
            }
        }
        System.out.println(map);
        for (int num : map.keySet()) {
            ans += num + 1;
        }
        return ans;
    }
}
