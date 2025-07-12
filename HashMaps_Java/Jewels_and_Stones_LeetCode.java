package HashMaps_Java;

import java.util.HashMap;

public class Jewels_and_Stones_LeetCode {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }

    static int numJewelsInStones(String jewels, String stones) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : jewels.toCharArray()) {
            map.put(ch, 1);
        }
        int count = 0;
        for (char ch : stones.toCharArray()) {
            if (map.containsKey(ch)) {
                count++;
            }
        }
        return count;
    }
}
