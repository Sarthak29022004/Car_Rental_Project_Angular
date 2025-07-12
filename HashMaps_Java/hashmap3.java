package HashMaps_Java;


import java.util.HashMap;
import java.util.Map;

public class hashmap3 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 4, 9, 9, 29, 27, 24};
        System.out.println(great(arr));
    }

    static int great(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        int res = 0;
        for (int key : map.keySet()) {   //most important
            if (map.get(key) > max) {
                max = map.get(key);
                res = key;
            }
        }
        int max2 = 0;
        for (int i: map.keySet()) {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (map.get(i)> entry.getValue()){
                    max2 = map.get(i);
                }
            }
        }
        System.out.println(map);
        return max2;
    }
}
