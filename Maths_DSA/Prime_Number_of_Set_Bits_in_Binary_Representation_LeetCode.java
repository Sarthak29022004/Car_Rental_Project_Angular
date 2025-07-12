package Maths_DSA;

public class Prime_Number_of_Set_Bits_in_Binary_Representation_LeetCode {
    public static void main(String[] args) {
        System.out.println(countPrimeSetBits(10, 15));
    }

    static int countPrimeSetBits(int left, int right) {
        int ans = 0;
        for (int i = left; i <= right; i++) {
            int num = i;
            int val = 0;
            while (num > 0) {
                int res = num % 2;
                if (res == 1) val++;
                num = num / 2;
            }
            boolean flag = true;
            if (val == 1) {
                continue;
            }
            for (int j = 2; j < val; j++) {
                if (val % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ans++;
            }
        }
        return ans;
    }
}
