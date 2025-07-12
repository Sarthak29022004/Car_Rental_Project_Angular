package HashMaps_Java;

import java.util.HashMap;

public class Permutation_Difference_between_Two_Strings_LeetCode {
    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abcde", "edbac"));
    }

    static int findPermutationDifference(String s, String t) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ans += Math.abs(s.indexOf(ch) - t.indexOf(ch));
        }
        return ans;
//        HashMap<Character, Integer> map = new HashMap<>();
//        int i = 0;
//        for (char ch : t.toCharArray()) {
//            map.put(ch, i);
//            i++;
//        }
//        System.out.println(s.indexOf('a'));
//        int j = 0;
//        int ans = 0;
//        for (char ch : s.toCharArray()) {
//            ans += Math.abs(j - map.get(ch));
//            j++;
//        }
//        return ans;
    }
}
