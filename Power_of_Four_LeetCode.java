public class Power_of_Four_LeetCode {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(20));
    }

    static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) {
            n = n / 4;
        }
        return n == 1;
    }
}
