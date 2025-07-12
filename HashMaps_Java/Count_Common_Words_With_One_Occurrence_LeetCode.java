package HashMaps_Java;

import java.util.HashMap;

public class Count_Common_Words_With_One_Occurrence_LeetCode {
    public static void main(String[] args) {
        String[] str1 = {"a","ab"};
        String[] str2 = {"a","a","a","ab"};
        System.out.println(countWords(str1, str2));
    }

    static int countWords(String[] words1, String[] words2) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (String str : words1) {
            map1.put(str, map1.getOrDefault(str, 0) + 1);
        }
        for (String str : words2) {
            map2.put(str, map2.getOrDefault(str, 0) + 1);
        }
        int count=0;
        for (String key:map1.keySet()){
            if (map1.containsKey(key) && map2.containsKey(key)){
                if (map1.get(key)==1 && map2.get(key)==1) count++;
            }
        }
        return count;
    }
}
