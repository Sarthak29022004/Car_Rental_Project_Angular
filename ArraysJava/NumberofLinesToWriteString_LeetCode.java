package ArraysJava;

import java.util.Arrays;

public class NumberofLinesToWriteString_LeetCode {
    public static void main(String[] args) {
        int[] width = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int[] ans = numberOfLines(width, "bbbcccdddaaa");
        System.out.println(Arrays.toString(ans));
    }

    static int[] numberOfLines(int[] widths, String s) {
        int pixels = 0;
        int lines = 1;
        for (char ch : s.toCharArray()) {
            int sum = (int) (Math.abs(97 - ch));
            if (widths[sum] + pixels > 100) {
                pixels = 0;
                lines++;
            }
            pixels = pixels + widths[sum];
        }
        return new int[]{lines, pixels};
    }
}
