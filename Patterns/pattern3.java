package Patterns;

//         * * * * *
//         * * * *
//         * * *
//         * *
//         *

public class pattern3 {
    public static void main(String[] args) {
        pat(5);
    }

    static void pat(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {  //5-4+1=2
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
