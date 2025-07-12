package Patterns;

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
//         * * * *
//          * * *
//           * *
//            *

public class pattern28 {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int n) {
        for (int row = 1; row <= n * 2 - 1; row++) {
            int limit = row;
            if (row > 5) {
                limit = 2 * n - row;
            }
            int spaces = n - limit;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= limit; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
