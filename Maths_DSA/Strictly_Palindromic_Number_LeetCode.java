package Maths_DSA;

public class Strictly_Palindromic_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(isStrictlyPalindromic(4));
    }

    static boolean isStrictlyPalindromic(int n) {
        int m = n;
        int val = 0;
        int val1;
        int val2 = 0;
        for (int i = 2; i <= n - 2; i++) {
            while (m > 0) {
                val = val * 10 + (m % i);
                m = m / i;
            }
            val1 = val;
            while (val1 > 0) {
                val2 = val2 * 10 + val1 % 10;
                val1 = val1 / 10;
            }
            if (val != val2) {
                return false;
            }
            val = 0;
            val1 = 0;
            val2 = 0;
            m = n;
        }
        return true;
    }
}
