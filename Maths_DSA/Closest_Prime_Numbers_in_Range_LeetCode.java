package Maths_DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Closest_Prime_Numbers_in_Range_LeetCode {
    public static void main(String[] args) {
        Closest_Prime_Numbers_in_Range_LeetCode obj = new Closest_Prime_Numbers_in_Range_LeetCode();
        int[] arr = obj.closestPrimes(1000, 19000);
        System.out.println(Arrays.toString(arr));
    }

    public int[] closestPrimes(int left, int right) {
        long start = System.currentTimeMillis();
        boolean[] isPrime = new boolean[right + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 0; (i * i) < right; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= right; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                list.add(i);
            }
        }
        int num1 = -1;
        int num2 = -1;
        int minDiff = right - left;
        for (int i = 1; i < list.size(); i++) {
            if ((list.get(i) - list.get(i-1))<minDiff){
                num1 = list.get(i - 1);
                num2 = list.get(i);
                minDiff = list.get(i) - list.get(i-1);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start + "ms");
        return new int[]{num1, num2};
    }
//    public int[] closestPrimes(int left, int right) {
//        if (left > right) return new int[]{-1, -1};
//
//        // Step 1: Sieve of Eratosthenes
//        boolean[] isPrime = new boolean[right + 1];
//        Arrays.fill(isPrime, true);
//        isPrime[0] = isPrime[1] = false;
//
//        for (int i = 2; i * i <= right; i++) {
//            if (isPrime[i]) {
//                for (int j = i * i; j <= right; j += i) {
//                    isPrime[j] = false;
//                }
//            }
//        }
//
//        // Step 2: Collect primes in range [left, right]
//        List<Integer> primes = new ArrayList<>();
//        for (int i = left; i <= right; i++) {
//            if (isPrime[i]) primes.add(i);
//        }
//
//        // Step 3: If fewer than 2 primes exist, return [-1, -1]
//        if (primes.size() < 2) return new int[]{-1, -1};
//
//        // Step 4: Find the closest prime pair
//        int minDiff = Integer.MAX_VALUE, num1 = -1, num2 = -1;
//        for (int i = 1; i < primes.size(); i++) {
//            int diff = primes.get(i) - primes.get(i - 1);
//            if (diff < minDiff) {
//                minDiff = diff;
//                num1 = primes.get(i - 1);
//                num2 = primes.get(i);
//            }
//        }
//
//        return new int[]{num1, num2};
//    }
}
