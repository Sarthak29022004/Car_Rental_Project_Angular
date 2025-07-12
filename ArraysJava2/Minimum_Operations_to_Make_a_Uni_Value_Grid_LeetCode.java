package ArraysJava2;

public class Minimum_Operations_to_Make_a_Uni_Value_Grid_LeetCode {
    public static void main(String[] args) {
        int[][] arr = {
                {146}
        };
        System.out.println(minOperations(arr, 2));
    }

    static int minOperations(int[][] grid, int x) {
        if(grid.length==1 && grid[0].length==1) return 0;
        int max = Integer.MIN_VALUE;
        for (int[] ar : grid) {
            for (int n : ar) {
                if (n > max) max = n;
            }
        }
        int num = max / 2;
        int ans = 0;
        for (int[] ar : grid) {
            for (int n : ar) {
                if (n < num) {
                    while (n <= num) {
                        ans = ans + 1;
                        n = n + x;
                        if (n == num) break;
                        if (n > num) return -1;
                    }
                }
                if (n > num) {
                    while (n >= num) {
                        ans = ans + 1;
                        n = n - x;
                        if (n == num) break;
                        if (n < num) return -1;
                    }
                }
            }
        }
        return ans;
    }
}
