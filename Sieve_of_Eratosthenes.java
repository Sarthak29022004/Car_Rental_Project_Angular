import java.util.Arrays;

public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Sieve_of_Eratosthenes obj = new Sieve_of_Eratosthenes();
        obj.SieveOfEratosthenes(100);
        soe(100);
    }

    public void SieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; (i * i) <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                System.out.print(i + "  ");
            }
        }
        System.out.println();
        System.out.println("Total prime numbers = " + count);
    }

    static void soe(int n) {
        boolean[] ispr = new boolean[n + 1];
        ispr[0] = ispr[1] = true;
        System.out.println(Arrays.toString(ispr));
        for (int i = 2; (i * i) <= n; i++) {
            if (!ispr[i]) {
                for (int j = i * 2; j <= n; j = j + i) {
                    ispr[j] = true;
                }
            }
        }
        for (int i = 0; i <= n; i++) {
            if (!ispr[i]) System.out.print(i + " ");
        }
    }
}
