package Strings_And_StringBuilder;

import javax.swing.*;

public class palindrome {
    public static void main(String[] args) {
        String s = "Oppo";
        System.out.println(checkP(s));
    }

    static String checkP(String name) {
        if (name == null || name.length() == 0) return "Palindrome";
        name = name.toLowerCase();
        int start = 0;
        int end = name.length() - 1;
        while (start < end) {
            if (name.charAt(start) != name.charAt(end)) return "Not a Palindrome";
            start++;
            end--;
        }
        return "Palindrome";
    }
//    time complexity = O(n)
}
