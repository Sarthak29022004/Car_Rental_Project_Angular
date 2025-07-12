import javax.swing.*;
import java.util.Scanner;

public class armstrongnum {
    public static void main(String[] args) {
        ufl();

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the no : ");
        int n = in.nextInt();
        arms(n);
    }

    static boolean arms(int n) {
        int original = n;
        int ans = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem * rem * rem;
        }
        if (ans == original) {
            System.out.println("Armstrong");
        }
        return ans == original;
    }

    static void ufl() {
        for (int i = 100; i < 1000; i++) {
            if (arms(i)) {
                System.out.println(i + " ");
            }
        }
    }
}
