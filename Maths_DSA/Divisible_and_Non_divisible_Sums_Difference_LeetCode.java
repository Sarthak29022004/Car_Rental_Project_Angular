package Maths_DSA;

public class Divisible_and_Non_divisible_Sums_Difference_LeetCode {
    public static void main(String[] args) {
        System.out.println(differenceOfSums(10, 3));
    }
    static int differenceOfSums(int n, int m) {
        boolean[] arr = new boolean[n + 1];
        for (int i = m; i <= n; i = i + m) {
            arr[i] = true;
        }
        int num1 = 0;
        int num2 = 0;
        for (int i = 0; i <= n; i++) {
            if(arr[i]){
                num2 += i;
            } else {
                num1 += i;
            }
        }
        return num1-num2;
    }
}
