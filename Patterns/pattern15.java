package Patterns;

//                              *
//                             * *
//                            *   *
//                           *     *
//                          *       *
//                           *     *
//                            *   *
//                             * *
//                              *

public class pattern15 {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int n) {
        int innerSpace = 1;
        for (int row = 1; row < 2 * n; row++) {
            int colLimit = 2;
            if (row == 1 || row == 2 * n - 1) {
                colLimit = 1;
            }
            int spceLimit = n - row;
            if (row > n) {
                spceLimit = row - n;
            }
            for (int space = 1; space <= spceLimit; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= colLimit; col++) {
                if (col > 1) {
                    if (row > n) {
                        innerSpace -= 2;
                        for (int inSpace = 1; inSpace < innerSpace-1; inSpace++) {
                            System.out.print(" ");
                        }
                    } else if (row <= n) {
                        for (int inSpace = 1; inSpace <= innerSpace; inSpace++) {
                            System.out.print(" ");
                        }
                        innerSpace += 2;
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
