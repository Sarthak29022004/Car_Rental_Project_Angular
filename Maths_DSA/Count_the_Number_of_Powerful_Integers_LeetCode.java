package Maths_DSA;

public class Count_the_Number_of_Powerful_Integers_LeetCode {
    public static void main(String[] args) {
        System.out.println(numberOfPowerfulInt(15, 215, 6, "10"));
    }

    static long numberOfPowerfulInt(long start, long finish, int limit, String suffix) {
        long num = Long.parseLong(suffix);
        int ans = 0;
        int len = 0;
        int len2 = (int) (Math.log10(num) + 1);
        long num2 = num;
        outerLoop:
        for (long i = start; i < finish; i++) {
            len = len2;
            num2 = num;
            long j = i;
            while (j > 0) {
                if (j % 10 > limit) {
                    continue outerLoop;
                }
                j = j / 10;
            }
            j = i;
            while (len > 0) {
                if (num2 % 10 != j % 10) {
                    continue outerLoop;
                }
                num2 /= 10;
                j /= 10;
                len--;
            }
            if (len == 0) {
                ans++;
            }
        }
        return ans;
    }
}
