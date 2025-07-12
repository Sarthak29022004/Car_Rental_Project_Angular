package Maths_DSA;

import java.util.Arrays;

public class Maximum_Number_of_Coins_You_Can_Get_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,4,1,2,7,8};
        System.out.println(maxCoins(arr));
    }

    static int maxCoins(int[] piles) {
        int n = piles.length;
        int r = n / 3;
        int ans = 0;
        Arrays.sort(piles);
        int i = n - 2;
        while (r > 0) {
            ans += piles[i];
            i = i - 2;
            r--;
        }
        return ans;
    }
}
