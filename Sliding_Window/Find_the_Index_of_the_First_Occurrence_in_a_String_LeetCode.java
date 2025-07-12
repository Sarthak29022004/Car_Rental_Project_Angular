package Sliding_Window;

public class Find_the_Index_of_the_First_Occurrence_in_a_String_LeetCode {
    public static void main(String[] args) {
        System.out.println(strStr("leetcode", "leeto"));
    }

    static int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        for (int i = 0; i < h - n + 1; i++) {
            String str = haystack.substring(i, i + n);
            if (str.equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}