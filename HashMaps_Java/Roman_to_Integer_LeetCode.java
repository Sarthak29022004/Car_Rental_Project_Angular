package HashMaps_Java;

import java.util.HashMap;

public class Roman_to_Integer_LeetCode {
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    //    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//
    static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int store = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) store -= map.get(s.charAt(i));
            else store += map.get(s.charAt(i));
        }
        return store + map.get(s.charAt(s.length() - 1));
    }
}
