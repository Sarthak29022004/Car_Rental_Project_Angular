package Strings_And_StringBuilder;

public class Largest_Odd_Number_in_String_LeetCode {
    public static void main(String[] args) {
        System.out.println(largestOddNumber("522"));
    }

    static public String largestOddNumber(String str) {
        int n = str.length() - 1;
        System.out.println(49%100);
        while (n > -1) {
            char ch = str.charAt(n);
            if (ch % 2 != 0) {
                break;
            }
            n--;
        }
        String ans = str.substring(0, n + 1);
        return ans;
    }
}
