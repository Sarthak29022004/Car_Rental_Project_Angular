public class Climbing_Stairs_LeetCode {
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }

    static int climbStairs(int n) {
        if (n == 1 || n == 2) return n;
        int fStep = 1;
        int sStep = 2;
        int count = 0;
        for (int i = 2; i < n; i++) {
            count = fStep + sStep;
            fStep = sStep;
            sStep = count;
        }
        return count;
    }
}
//1111
//22
//112
//121
//211

//  1 -> 1
//  2 -> 2
//  3 -> 3
//  4 -> 5
