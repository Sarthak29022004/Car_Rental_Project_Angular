package Strings_And_StringBuilder;

import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters_LeetCode {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int len = 1;
        char[] charArray = s.toCharArray();
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] != charArray[i - 1] && !map.containsKey(charArray[i])) {
                len++;
                map.put(charArray[i],1);
            }
        }
        return len;
    }
}
