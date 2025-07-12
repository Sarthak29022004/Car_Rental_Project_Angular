package ArraysJava2;

public class LeetCode_Find_Numbers_with_even_no_of_digit {
    public static void main(String[] args) {
        int[] arr = {45, 890, 356, 45, -90};
        int ans = findNumbers(arr);
        System.out.println(ans);
        System.out.println(findNumbers2(arr));
    }
//===================   1st Method    =================================
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {          // 1st use for loop to take single no.
            if (i < 0) {              // converting negative no. to positive no.
                i = i * -1;
            }
            int divide = 0;
            while (i > 0) {           // 2nd  use n=n/10 method to find length of no.
                divide++;
                i = i / 10;
            }
            if (divide % 2 == 0) {    // 3rd  Divide the no. length with 2
                count++;
            }
        }
        return count;
    }
//==========================   Short-Cut Method   ==========================
    static int findNumbers2(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if ((int) (Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
