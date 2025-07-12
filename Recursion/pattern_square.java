package Recursion;

public class pattern_square {
    public static void main(String[] args) {
        square(5);
        triangle(5,0);
    }

    static void square(int r) {
        if (r == 0) return;
        col(5);
        System.out.println();
        square(r - 1);
    }

    static void col(int c) {
        if (c == 0) return;
        System.out.print("* ");
        col(c - 1);
    }

//===================  2nd Method  ========================
    static void triangle(int r, int c) {
        if (r == 0) return;
        if (c < r) {
            System.out.print("* ");
            triangle(r, c + 1);
        } else {
            System.out.println();
            triangle(r - 1, 0);
        }
    }
}
