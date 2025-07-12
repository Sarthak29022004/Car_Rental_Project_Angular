package Recursion;

import java.util.ArrayList;

public class AMAZON_Dice_Combinations_LeetCode {
    public static void main(String[] args) {
        System.out.println(dice("",4));   //[1111, 112, 121, 13, 211, 22, 31, 4]
    }

    static ArrayList<String> dice(String p, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> Mainlist = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            Mainlist.addAll(dice(p + i, target - i));
        }
        return Mainlist;
    }
}
//1111
//112
//121
//13
//211
//22
//31
//4