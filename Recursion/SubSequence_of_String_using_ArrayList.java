package Recursion;

import java.util.ArrayList;

public class SubSequence_of_String_using_ArrayList {
    public static void main(String[] args) {
        System.out.println(subSequence("", "abc"));  //[abc, ab, ac, a, bc, b, c, ]
    }

    static ArrayList<String> subSequence(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subSequence(p + ch, up.substring(1));
        System.out.println(left);
        ArrayList<String> right = subSequence(p, up.substring(1));
        System.out.println(right);
        left.addAll(right);
        return left;
    }
}
