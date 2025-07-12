package Recursion;

public class Fibonacci_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
