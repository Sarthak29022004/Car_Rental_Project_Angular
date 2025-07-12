package Maths_DSA;

import java.util.HashMap;
import java.util.HashSet;

public class Ugly_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(isUgly(1));
    }

    static boolean isUgly(int n) {
        HashSet<Integer> set = new HashSet<>();
        set.add(7);
        set.add(11);
        set.add(13);
        set.add(17);
        set.add(19);
        set.add(23);
        set.add(29);
        set.add(31);
        set.add(37);
        set.add(41);
        set.add(43);
        set.add(47);
        set.add(53);
        set.add(59);
        set.add(61);
        set.add(67);
        set.add(71);
        set.add(73);
        set.add(79);
        set.add(83);
        set.add(89);
        set.add(97);
        for (int num : set) {
            if (n % num == 0) {
                return false;
            }
        }
        return true;
    }
}
