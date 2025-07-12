package ArraysJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Count_Days_Without_Meetings_LeetCode {
    public static void main(String[] args) {
        Count_Days_Without_Meetings_LeetCode obj = new Count_Days_Without_Meetings_LeetCode();
        int[][] arr = {
                {5, 7},
                {1, 3},
                {9, 10}
        };
        System.out.println(obj.countDays(10, arr));
    }

    public int countDays(int days, int[][] meetings) {
        boolean[] mt = new boolean[days + 1];
        mt[0] = true;
        for (int[] ar : meetings) {
            for (int i = ar[0]; i <= ar[1]; i++) {
                mt[i]=true;
            }
        }
        int ans = 0;
        for (int i = 1; i <= days; i++) {
            if (!mt[i]) ans++;
        }
        return ans;
    }
}
