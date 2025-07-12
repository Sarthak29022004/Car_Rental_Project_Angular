package Maths_DSA;

public class OddEven {
    public static void main(String[] args) {
        if (isOdd(6)) System.out.println("Odd");
        else System.out.println("Even");
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
