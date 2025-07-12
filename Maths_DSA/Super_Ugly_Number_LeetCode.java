package Maths_DSA;

public class Super_Ugly_Number_LeetCode {
    public static void main(String[] args) {
        Super_Ugly_Number_LeetCode obj = new Super_Ugly_Number_LeetCode();
        int[] primes = {2, 7, 13, 19};
        System.out.println(obj.nthSuperUglyNumber(12, primes));
    }

    public int nthSuperUglyNumber(int n, int[] primes) {
        int i = 1;
        int num = 1;
        while (num != n) {
            for (int j = 0; j < primes.length; j++) {
                if (i % primes[j] == 0) {
                    num++;
                    break;
                }
            }
            i++;
        }
        return i;
    }
}
