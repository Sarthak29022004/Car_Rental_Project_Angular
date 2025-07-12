package Maths_DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Number_of_Laser_Beams_in_a_Bank_LeetCode {

    public static void main(String[] args) {
        String[] bank = {"0111000010100", "0101100000000", "1011000001000", "1000001000000", "1000100010000", "0000001111111", "1111111111110", "0000001000001", "0000101010101", "0000001000001", "0000101010101", "1100001010000", "0000000100001", "1111111111000", "1010101010000", "0000000001000", "1000100010000", "0001000100010", "0000011111111", "0111001000000", "0000010000001", "0000101010101", "0000001000000"};
        System.out.println();
        System.out.println(numberOfBeams(bank));
    }

    public static int numberOfBeams(String[] bank) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String str : bank) {

            int ans = 0;
            int len = str.length();
            char[] ch = str.toCharArray();
            for (int y = 0; y < len; y++) {
                if (ch[y] == '1') {
                    ans++;
                }
            }
            if (ans > 0) {
                list.add(ans);
            }
        }
        if (list.size() == 1) {
            return 0;
        }
        int ans2 = 0;
        for (int k = 1; k < list.size(); k++) {
            ans2 = ans2 + (list.get(k - 1) * list.get(k));
        }
        return ans2;
    }
}
