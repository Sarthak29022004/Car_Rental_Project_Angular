package Recursion;

import java.util.ArrayList;

public class Permutations_String {
    public static void main(String[] args) {
        permutations("", "abc");

        ArrayList<String> ans = permutationsusingArrayList("", "abc");
        System.out.println(ans); //[cba, bca, bac, cab, acb, abc]

        System.out.println(permutationsCount("","abc")); //6
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

//===================    using ArrayList    =========================

    static ArrayList<String> permutationsusingArrayList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> Mainlist = new ArrayList<>();
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            Mainlist.addAll(permutationsusingArrayList(f + ch + s, up.substring(1)));
        }
        return Mainlist;
    }

    //===================    permutations Count    =========================

    static int permutationsCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationsCount(f + ch + s, up.substring(1));
        }
        return count;
    }
}
//cba
//bca
//bac
//cab
//acb
//abc