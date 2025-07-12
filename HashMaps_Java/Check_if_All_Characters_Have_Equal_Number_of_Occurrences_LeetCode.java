package HashMaps_Java;

import java.util.HashMap;

public class Check_if_All_Characters_Have_Equal_Number_of_Occurrences_LeetCode {
    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("aaabb"));
    }

    static boolean areOccurrencesEqual(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int ocr = map.get(s.charAt(0));
        for (char ch : map.keySet()) {
            if (map.get(ch)!=ocr) return false;
        }
        return true;
    }
}
