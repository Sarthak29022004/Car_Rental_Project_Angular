package Recursion;

public class prints_number {
    public static void main(String[] args) {
        print(5);
        printRev(5);
        printBoth(5);
    }

    static void print(int n) {
        if (n == 0) return;
        System.out.println(n);
        print(n - 1);                       //5,4,3,2,1
    }

    static void printRev(int n) {
        if (n == 0) return;
        printRev(n - 1);
        System.out.println(n);         //1,2,3,4,5
    }

    static void printBoth(int n) {
        if (n == 0) return;
        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);             //5,4,3,2,1,1,2,3,4,5
    }
}
