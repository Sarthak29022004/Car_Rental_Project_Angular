package Maths_DSA;

public class Stone_Game_III_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        System.out.println(stoneGameIII(arr));
    }

    static String stoneGameIII(int[] stoneValue) {
        System.out.println(10%5);
        int len = stoneValue.length;
        if (len <= 3) return "Alice";
        int n = len / 3;
        int a = 0;
        int b = 0;
        int i = 0;
        while (i < len && i + 3 < len) {
            a += stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2];
            i = i + 3;
        }
        int j = 3;
        while (j < len && j + 3 < len) {
            b += stoneValue[j] + stoneValue[j + 1] + stoneValue[j + 2];
            j = j + 3;
        }
        if (n % 2 != 0) {
            int val = len % 3;
            for (int k = 0; k < val; k++) {
                b += stoneValue[len - 1 - k];
            }
        }
        if (n % 2 == 0) {
            int val = len % 3;
            for (int k = 0; k < val; k++) {
                a += stoneValue[len - 1 - k];
            }
        }
        if (a > b) return "Alice";
        if (a < b) return "Bob";
        if (a == b) return "Tie";
        return "Alice";
    }
}
