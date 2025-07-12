package Recursion;

public class multiplicationOfNumber {
    public static void main(String[] args) {
        System.out.println(mul(5, -6));
    }
//    4 * 3 == 3 + 3 + 3 + 3
    static int mul(int a, int b) {
        if (a == 0) return 0;
        if (a < 0) return mul(a + 1, b) - b;
        return mul(a - 1, b) + b;
    }
}
