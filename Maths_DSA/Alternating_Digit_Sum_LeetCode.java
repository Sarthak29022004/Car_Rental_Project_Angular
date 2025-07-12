package Maths_DSA;

public class Alternating_Digit_Sum_LeetCode {
    public static void main(String[] args) {
        System.out.println(alternateDigitSum(521));  //Explanation: (+5) + (-2) + (+1) = 4.
    }

    static int alternateDigitSum(int n) {
        int len = 0;
        int num = n;
        while (num > 0) {
            len++;
            num /= 10;
        }
        int ans = 0;
        boolean flag = true;
        if (len % 2 == 0) {
            while (n > 0) {
                if (flag) {
                    ans = ans - n % 10;
                    flag = false;
                } else {
                    ans = ans + n % 10;
                    flag = true;
                }
                n /= 10;
            }
        } else {
            while (n > 0) {
                if (flag) {
                    ans = ans + n % 10;
                    flag = false;
                } else {
                    ans = ans - n % 10;
                    flag = true;
                }
                n /= 10;
            }
        }
        return ans;
    }
}
