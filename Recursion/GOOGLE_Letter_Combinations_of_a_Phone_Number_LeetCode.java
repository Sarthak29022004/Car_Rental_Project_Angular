package Recursion;

import java.util.ArrayList;

public class GOOGLE_Letter_Combinations_of_a_Phone_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(letterCombinations("", "23"));
    }

    static ArrayList<String> letterCombinations(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> Mainlist = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            Mainlist.addAll(letterCombinations(p + ch, up.substring(1)));
        }
        return Mainlist;
    }
}
