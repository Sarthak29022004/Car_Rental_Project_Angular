package Recursion;

public class pattern_upside_down_triangle {
    public static void main(String[] args) {
        square(5);
    }

    static int square(int r) {
        if (r == 0) return 0;
        fun(r - 1);
        System.out.println();
        return square(r - 1);
    }

    static int fun(int c) {
        if (c == 0) return 0;
        System.out.print("* ");
        return fun(c - 1);
    }
}
