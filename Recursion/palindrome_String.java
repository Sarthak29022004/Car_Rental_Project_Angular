package Recursion;

public class palindrome_String {
    public static void main(String[] args) {
        System.out.println(isPalindrome("rotator"));
    }

    static boolean isPalindrome(String str) {
        String s= str.toLowerCase();
        int n = s.length();
        if (n <= 1) return true;
        if (s.charAt(0) != s.charAt(n - 1)) return false;
        String substr = s.substring(1, n - 1);
        return isPalindrome(substr);
    }
}
