package HashMaps_Java;
import java.util.HashMap;

public class Longest_Harmonious_Subsequence_LeetCode {
    public static void main(String[] args) {
        Longest_Harmonious_Subsequence_LeetCode obj = new Longest_Harmonious_Subsequence_LeetCode();
        int[] nums = {1,2,3,4};
        System.out.println(obj.findLHS(nums));
    }

    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                ans = Math.max(ans,map.get(key)+map.get(key + 1));
            }
        }
        return ans;
    }
}
