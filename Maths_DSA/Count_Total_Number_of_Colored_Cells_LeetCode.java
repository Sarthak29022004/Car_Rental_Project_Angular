package Maths_DSA;

public class Count_Total_Number_of_Colored_Cells_LeetCode {
    public static void main(String[] args) {
        System.out.println(coloredCells(7));
    }
    static long coloredCells(int n) {
        return (long) n * n + ((long) (n - 1) * (n-1));
    }
}
// 1 -> 1
// 2 -> 5
// 3 -> 13
// 4 -> 25
// 5 -> 41