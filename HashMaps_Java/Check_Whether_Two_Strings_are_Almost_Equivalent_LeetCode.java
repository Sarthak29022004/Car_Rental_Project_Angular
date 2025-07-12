package HashMaps_Java;

import java.util.HashMap;

public class Check_Whether_Two_Strings_are_Almost_Equivalent_LeetCode {
    public static void main(String[] args) {
        System.out.println(checkAlmostEquivalent("zzzyyy", "iiiiii"));
    }

    static boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char ch : word1.toCharArray()) {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for (char ch : word2.toCharArray()) {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }
        for (char ch : map1.keySet()) {
            if (map1.containsKey(ch) && map2.containsKey(ch)) {
                if (map1.get(ch) >= map2.get(ch)) {
                    if (map1.get(ch) - map2.get(ch) > 3) return false;
                } else {
                    if (map2.get(ch) - map1.get(ch) > 3) return false;
                }
            }else if (map2.containsKey(ch)) {
                if (map2.get(ch) > 3) return false;
            } else {
                if (map1.get(ch) > 3) return false;
            }
        }
        for (char ch : map2.keySet()) {
            if (!map1.containsKey(ch)){
                if (map2.get(ch) > 3) return false;
            }
        }
        return true;
    }
}
//        int[] freq = new int[26];
//        for(int i = 0; i < word1.length(); i++){
//            freq[word1.charAt(i) - 'a']++;
//        }
//        for(int i = 0; i < word2.length(); i++){
//            freq[word2.charAt(i) - 'a']--;
//        }
//        for(int i = 0; i < freq.length; i++){
//            if (Math.abs(freq[i]) > 3){
//                return false;
//            }
//        }
//        return true;