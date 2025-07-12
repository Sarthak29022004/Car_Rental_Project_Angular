import java.util.Scanner;

public class maxNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
        //another method
        int maxx = Math.max(c, Math.max(a, b));  //Math.max(a, b)
        System.out.println(maxx);
        // int s = Math.multiplyExact(a, b);
        // System.out.println(s);
    }
}
