package Recursion;

public class reverse_Number {
    public static void main(String[] args) {
        System.out.println(rev(1234));
        System.out.println(rev2(1234));
        System.out.println(rev3(1234));
    }

    static int rev(int n) {
        int len = (int) (Math.log10(n) + 1);
        return helper(n, len);
    }

    static int helper(int n, int len) {
        if (n % 10 == n) return n;
        int rem = n % 10;
        return rem * (int) (Math.pow(10, len - 1)) + helper(n / 10, len - 1);
    }

    static int rev2(int n) {
        if (n % 10 == n) return n;
        int len = (int) (Math.log10(n) + 1);
        int rem = n % 10;
        return rem * (int) (Math.pow(10, len - 1)) + rev2(n / 10);
    }

    static int rev3(int n) {
        if (n % 10 == n) return n;
        return (n % 10) * (int) (Math.pow(10, (int) (Math.log10(n)))) + rev3(n / 10);
    }
}
