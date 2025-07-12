package Recursion;

public class Power_of_Three_LeetCode {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(24));
    }

    static boolean isPowerOfThree(int n) {
        if (n <= 0) return false;
        while (n % 3 == 0) {
            n = n / 3;
        }
        return n == 1;
//        if (n == 2147483647) return true;
//        for (int i = 0; i < 10000; i++) {
//            if ((int) (Math.pow(3, i)) == n) return true;
//            if ((int) (Math.pow(3, i)) > n) return false;
//        }
//        return false;
    }
}
