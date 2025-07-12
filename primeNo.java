import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);
        isPrime2(n);
        isPrime3(n);
    }

    //========    1st method     ==============
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return c * c >= n;
    }

    //========    2nd method     ==============
    static void isPrime2(int n) {
        int flag = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0) {
            System.out.println(n + " is prime number");
        }
    }

    //=============  3rd method      ===============
    static void isPrime3(int n) {
        int flag = 0;
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                flag = 1;
                System.out.println("Not a prime no.");
                break;
            }
            i++;
        }
        if (flag ==0){
            System.out.println("prime no.");
        }
    }
}
