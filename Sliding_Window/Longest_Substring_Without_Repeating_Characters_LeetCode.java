package Sliding_Window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_LeetCode {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    static int lengthOfLongestSubstring(String s) {
        ArrayList<String> list = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int wStart = 0;
        int wEnd = 0;
        int longLen = 0;
        while (wEnd < n) {
            char ch = s.charAt(wEnd);
            if (map.containsKey(ch) && map.get(ch) >= wStart) {
                wStart = map.get(ch) + 1;
            }
            map.put(ch, wEnd);
            longLen = Math.max(longLen, wEnd - wStart + 1);
            wEnd++;
        }
        return longLen;
    }
}
