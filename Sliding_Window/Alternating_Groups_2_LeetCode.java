package Sliding_Window;

public class Alternating_Groups_2_LeetCode {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0};
        System.out.println(numberOfAlternatingGroups(arr, 3));
    }

    static int numberOfAlternatingGroups(int[] colors, int k) {
        int ans = 0;
        int w = 1;
        int n = colors.length;
        for (int i = 0; i < n + k - 2; i++) {
            if (colors[i % n] != colors[(i + 1) % n]) w++;
            else w = 1;
            if (w >= k) ans++;
        }
        return ans;
    }
}
//        for (int i = 1; i <= n - 1 + k - 1; i++) {
//            if (colors[(i - 1 + n) % n] != colors[i % n]) w++;
//            else w = 1;
//            if (w >= k) ans++;
//        }