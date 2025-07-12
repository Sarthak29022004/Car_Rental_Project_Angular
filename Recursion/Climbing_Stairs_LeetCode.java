package Recursion;

public class Climbing_Stairs_LeetCode {
    public static void main(String[] args) {
        System.out.println(climbStairs(7));
    }

    static int climbStairs(int n) {
        if (n == 1 || n == 2) return n;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    static int climbStairs2(int n) {
        if (n == 1 || n == 2)
            return n;
        int num1 = climbStairs2(n - 1);
        int num2 = climbStairs2(n - 2);
//      int num1 + num2;
        return num1 + num2;
    }
}
