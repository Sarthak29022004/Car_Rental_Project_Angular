package ArraysJava2;

public class Number_of_Equivalent_Domino_Pairs_LeetCode {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2},
                {2, 1},
                {3, 4},
                {5, 6}
        };
        System.out.println(numEquivDominoPairs(arr));
    }

    public static int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length;
        int i = 0;
        int ans = 0;
        while (i < n - 1) {
            int j = i + 1;
            while (j < n) {
                int a = dominoes[i][0], b = dominoes[i][1];
                int c = dominoes[j][0], d = dominoes[j][1];
                if ((a == c && b == d) || (a == d && b == c)) {
                    ans++;
                }
                j++;
                j++;
            }
            i++;
        }
        return ans;
    }
}
