package Maths_DSA;

public class Three_Divisors_LeetCode {
    public static void main(String[] args) {
        System.out.println(isThree(4));  //1,2,4
    }
    static boolean isThree(int n) {
        int div = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                div++;
            }
            if (div == 4) {
                return false;
            }
        }
        if (div == 3) {
            return true;
        }
        return false;
    }
}
