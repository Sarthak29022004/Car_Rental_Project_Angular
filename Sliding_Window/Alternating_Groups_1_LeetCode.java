package Sliding_Window;

public class Alternating_Groups_1_LeetCode {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 0, 1};
        System.out.println(numberOfAlternatingGroups(arr));
    }

    static int numberOfAlternatingGroups(int[] colors) {
        int ans = 0;
        int n = colors.length;
        for (int i = 0; i < n; i++) {
            if (colors[(i + 1) % n] != colors[i] && colors[(i + 1) % n] != colors[(i + 2) % n]) {
                ans++;
            }
        }
        return ans;
    }
}
