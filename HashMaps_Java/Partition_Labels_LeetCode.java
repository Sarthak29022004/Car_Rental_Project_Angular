package HashMaps_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Partition_Labels_LeetCode {
    public static void main(String[] args) {
        System.out.println(partitionLabels("eccbbbbdec"));
    }

    static List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.toCharArray().length; i++) {
            char c = s.charAt(i);
            map.put(c, i);
        }
        List<Integer> list = new ArrayList<>();
        int size = 0, end = 0;
        for (int i = 0; i < s.toCharArray().length; i++) {
            size++;
            char ch = s.charAt(i);
            if (map.get(ch) >= end) {
                end = map.get(ch);
            }
            if (i == end) {
                list.add(size);
                size = 0;
                end = 0;
            }
        }
        return list;
    }
}
