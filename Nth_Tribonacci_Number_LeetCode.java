public class Nth_Tribonacci_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(tribonacci(25));
    }

    static int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 0;
        if (n == 2) return 1;
        if (n == 3) return 2;
        int num1 = 0;
        int num2 = 1;
        int num3 = 1;
        int temp = 0;
        for (int i = 3; i <= n; i++) {
            temp = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = temp;
        }
        return temp;
    }
}
