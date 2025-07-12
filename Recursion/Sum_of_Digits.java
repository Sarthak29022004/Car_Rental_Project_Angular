package Recursion;

public class Sum_of_Digits {
    public static void main(String[] args) {
        System.out.println(sumDigit(1451));      //11
    }

    static int sumDigit(int n) {
        if (n <= 0) return 0;
        return (n % 10) + sumDigit(n / 10);
    }
}

//    Input: n = 123
//    Execution Steps:

// 1) sumDigit(123)
//    123 % 10 = 3
//    sumDigit(123 / 10) = sumDigit(12)

// 2) sumDigit(12)
//    12 % 10 = 2
//    sumDigit(12 / 10) = sumDigit(1)

// 3) sumDigit(1)
//    1 % 10 = 1
//    sumDigit(1 / 10) = sumDigit(0)
//    sumDigit(0) → Base case reached, returns 0
//
//    Now, returning back up the recursive calls:
//
//    sumDigit(1) = 1 + 0 = 1
//    sumDigit(12) = 2 + 1 = 3
//    sumDigit(123) = 3 + 3 = 6
//    Final Output:
//    sumDigit(123) = 6