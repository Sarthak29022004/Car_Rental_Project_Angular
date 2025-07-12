package Patterns;

public class pattern18 {
    public static void main(String[] args) {
        pat(10);
    }
    static void pat(int n) {

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
