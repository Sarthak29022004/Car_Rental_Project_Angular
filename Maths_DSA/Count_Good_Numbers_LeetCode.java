package Maths_DSA;

public class Count_Good_Numbers_LeetCode {

    static class Solution {
        static final long MOD = 1_000_000_007;

        long modExp(long base, long exp, long mod) {
            long result = 1;
            base %= mod;
            while (exp > 0) {
                if ((exp & 1) == 1)
                    result = (result * base) % mod;
                base = (base * base) % mod;
                exp >>= 1;
            }
            return result;
        }

        public int countGoodNumbers(long n) {
            long evens = (n + 1) / 2;
            long odds = n / 2;
            long evenPart = modExp(5, evens, MOD);
            long oddPart = modExp(4, odds, MOD);
            return (int)((evenPart * oddPart) % MOD);
        }
    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countGoodNumbers(400));
    }

//    static int countGoodNumbers(long n) {
//        int ans = 0;
//        if (n==1) ans++;
//        long n2 = (long)Math.pow(10,15);
//        for (long i = 0; i <= n2; i++) {
//            long len = (long) (Math.log10(i) + 1);
//            if(len>n) break;
//            if (len == n) {
//                long num = i;
//                while (num > 0) {
//                    long len2 = (long) (Math.log10(num) + 1);
//                    if (len2 % 2 != 0) {
//                        int num2 = (int) (num % 10);
//                        if (num2 % 2 != 0) {
//                            num = num / 10;
//                            continue;
//                        } else {
//                            ans++;
//                            num /= 10;
//                        }
//                    }
//                    if (len2 % 2 == 0) {
//                        int num2 = (int) (num % 10);
//                        if (num2 == 2 || num2 == 3 || num2 == 5 || num2 == 7) {
//                            num /= 10;
//                            ans++;
//                        }
//                        num /= 10;
//                    }
//                }
//            }
//        }
//        return ans;
//    }
}
