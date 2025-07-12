package Recursion;

public class Product_of_Digits {
    public static void main(String[] args) {
        System.out.println(prodDigit(1451));       //20
    }

    static int prodDigit(int n) {
        if (n % 10 == n) return n;
        return (n % 10) * prodDigit(n / 10);
    }
}
