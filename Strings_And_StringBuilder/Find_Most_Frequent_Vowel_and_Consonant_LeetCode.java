package Strings_And_StringBuilder;

import java.util.HashMap;

public class Find_Most_Frequent_Vowel_and_Consonant_LeetCode {
    public static void main(String[] args) {
        System.out.println(maxFreqSum("aeiaeia"));
    }

    public static int maxFreqSum(String s) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map1.put(ch, map1.getOrDefault(ch, 0) + 1);
            } else {
                map2.put(ch, map2.getOrDefault(ch, 0) + 1);
            }
        }
        int vowels = 0;
        for (char key:map1.keySet()){
            if (map1.get(key)>vowels){
                vowels = map1.get(key);
            }
        }
        int consonants = 0;
        for (char key:map2.keySet()){
            if (map2.get(key)>consonants){
                consonants = map2.get(key);
            }
        }
        return vowels + consonants;
    }
}
