package Recursion;

public class recursion2 {
    public static void main(String[] args) {
        System.out.println(fibo(10));
    }

    //0,1,1,2,3,5,8,13,21,34,55...

    static int fibo(int n) {
        if (n < 2) return n;
        return fibo(n - 1) + fibo(n - 2);
    }
}
