package ArraysJava;

public class missingNumber_LeetCode {
    public static void main(String[] args) {
        int[] nums = {0,1};
        int sum1 = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum1 = sum1 + i;    //Addition till length
        }

        int sum2 = 0;
        for (int i : nums) {
            sum2 = sum2 + i;    //Addition of all present numbers
        }

        System.out.println(sum1 - sum2);    //t = adition till length + Addition of all present numbers
    }

    static int missingNumber(int[] nums) {
        int sum1 = 0;
        for (int i = 1; i <= nums.length; i++) {
            sum1 = sum1 + i;
        }

        int sum2 = 0;
        for (int i : nums) {
            sum2 = sum2 + i;
        }

        return sum1-sum2;
    }
}
