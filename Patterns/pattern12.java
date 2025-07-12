package Patterns;

//        * * * * *
//         * * * *
//          * * *
//           * *
//            *
//           * *
//          * * *
//         * * * *
//        * * * * *


public class pattern12 {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int n) {
        int s = 2;
        for (int row = 1; row < 2 * n; row++) {
            int limit = n - row + 1;
            int spaceLimit = row - 1;
            if (row > n) {
                limit = row - n + 1;
                spaceLimit -= s;
                s += 2;
            }
            for (int space = 0; space < spaceLimit; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= limit; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
