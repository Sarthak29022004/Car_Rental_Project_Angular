package Maths_DSA;

public class Count_the_Digits_That_Divide_a_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(countDigits(121));
    }

    static int countDigits(int num) {
        int val = num;
        int count = 0;
        while (val > 0) {
            int n = val % 10;
            if (num % n == 0) {
                count++;
            }
            val = val / 10;
        }
        return count;
    }
}
