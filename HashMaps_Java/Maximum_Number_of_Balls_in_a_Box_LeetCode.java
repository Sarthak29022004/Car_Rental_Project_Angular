package HashMaps_Java;

import java.util.HashMap;

public class Maximum_Number_of_Balls_in_a_Box_LeetCode {
    public static void main(String[] args) {
        System.out.println(countBalls(11,104));
    }

    static int countBalls(int lowLimit, int highLimit) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int num = i;
            int ans = 0;
            while (num>0){
                ans = ans + (num % 10);
                num = num / 10;
            }
            map.put(ans,map.getOrDefault(ans,0)+1);
        }
        System.out.println(map);
        int max = 0;
        for (int key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
            }
        }
        return max;
    }
}

//    int num = i % 9;
//    if (num == 0) {
//        map.put(9, map.getOrDefault(9, 0) + 1);
//    } else {
//        map.put(num, map.getOrDefault(num, 0) + 1);
//    }