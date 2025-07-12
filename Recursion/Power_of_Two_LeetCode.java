package Recursion;

public class Power_of_Two_LeetCode {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }

    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}
