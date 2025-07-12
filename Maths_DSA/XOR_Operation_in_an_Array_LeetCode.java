package Maths_DSA;

public class XOR_Operation_in_an_Array_LeetCode {
    public static void main(String[] args) {
        System.out.println(xorOperation(4,3));
    }

    static int xorOperation(int n, int start) {
        int a = 0;
        for (int i = 0; i < n; i++) {
            a ^= start + 2 * i;
        }
//        for (int i = 1; i < n; i++) {
//            ans = ans ^ (start + 2);
//            start = start + 2;
//        }
        return a;
    }
}
