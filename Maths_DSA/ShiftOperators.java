package Maths_DSA;

public class ShiftOperators {
    public static void main(String[] args) {
        int a = 8;
//        int b = a << 1;      16
//        int b = a << 2;      32
//        int b = a << 3;      64

        a = 32;
//        int b = a >> 1;      16
//        int b = a >> 2;      8
//        int b = a >> 3;      4
        int b = a >>> 1;
        System.out.println(b);
    }
}
