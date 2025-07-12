package Patterns;

//          * * * * * * * * *
//            * * * * * * *
//              * * * * *
//                * * *
//                  *


public class pattern9 {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int n) {
        int limit = 1;
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space <= row-1; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= 2 * n - limit; col++) {
                System.out.print("* ");
            }
            System.out.println();
            limit += 2;
        }
    }
}
