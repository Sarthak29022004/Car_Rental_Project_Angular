package Patterns;

//                        *
//                      * * *
//                    * * * * *
//                  * * * * * * *
//                * * * * * * * * *

public class pattern8 {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= row + row - 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
