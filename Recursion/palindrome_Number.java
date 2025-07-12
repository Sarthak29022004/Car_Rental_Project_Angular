package Recursion;

public class palindrome_Number {
    public static void main(String[] args) {
        System.out.println(palin(12321));  //true
    }

    static boolean palin(int n) {
        return n == rev(n);
    }

    static int rev(int n) {
        if (n % 10 == n) return n;
        return (n % 10) * (int) (Math.pow(10, (int) (Math.log10(n)))) + rev(n / 10);
    }
}
