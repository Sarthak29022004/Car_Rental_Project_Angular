package Recursion;

public class Number_of_Digit_One_LeetCode {
    public static void main(String[] args) {
        System.out.println(countDigitOne(3184191));
    }

    static int countDigitOne(int n) {
        int count = 0;
        for (int i = n; i >= 0; i--) {
            int j = i;
            while (j > 0) {
                if (j % 10 == 1) {
                    count++;
                }
                j = j / 10;
            }
        }
        return count;
//        if (n == 0) return 0;
//        int num = n;
//        int c = 0;
//        while (num > 0) {
//            if (num % 10 == 1) c++;
//            num = num / 10;
//        }
//        return countDigitOne(n - 1) + c;
    }
}
