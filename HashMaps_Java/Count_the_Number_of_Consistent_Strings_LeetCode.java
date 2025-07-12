package HashMaps_Java;

import java.util.HashMap;

public class Count_the_Number_of_Consistent_Strings_LeetCode {
    public static void main(String[] args) {
        String[] words = {"ad","bd","aaab","baa","badab"};
        System.out.println(countConsistentStrings("ab",words));
    }

    static int countConsistentStrings(String allowed, String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : allowed.toCharArray()) {
            map.put(ch, 1);
        }
        int ans = 0;
        for (String s : words) {
            int len = 0;
            for (char ch : s.toCharArray()) {
                if (map.containsKey(ch)) len++;
            }
            if (len == s.length()) ans++;
        }
        return ans;
    }
}
