public class Fibonacci_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(fib(2));
    }

    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int a = 0;
        int b = 1;
        int temp = 0;
        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
