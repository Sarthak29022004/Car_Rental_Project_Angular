import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

        // ================== Single Dimentional Array
        // ========================================
        int a[] = { 10, 20, 30, 40 };
        Scanner sc = new Scanner(System.in);
        // System.out.print("Track the no. of element: ");
        // int n = sc.nextInt();
        // System.out.println(a[n - 1]);

        // System.out.print("Enter total no. of array: ");
        // int i, x = sc.nextInt();
        // int b[] = new int[x];
        // for (i = 0; i < x; i++) {
        // b[i] = sc.nextInt();
        // }
        // for (i = 0; i < x; i++) {
        // System.out.println("No." + (i + 1) + "= " + b[i]);
        // }

        String d[]={"Sarthak", "Nagesh", "Akshay"};
        System.out.println(d[2]);

        // ================== Multi Dimentional Array
        // ========================================
        int c[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}