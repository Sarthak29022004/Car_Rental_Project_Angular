package Sliding_Window;

public class Smallest_subArray_with_sum_greater_than_x {
    public static void main(String[] args) {
        int[] nums = {1,4,45,6,0,19};
        System.out.println(minSubArray(nums, nums.length, 51));
    }

    static int minSubArray(int[] arr, int n, int x) {
        int windowStart = 0;
        int windowEnd = 0;
        int sum = 0;
        int len = 0;
        int minLen = Integer.MAX_VALUE;
        while (windowEnd < n) {
            sum += arr[windowEnd];
            if (sum > x) {
                len = windowEnd - windowStart + 1;
                minLen = Math.min(len, minLen);
                while (windowStart < windowEnd && sum > x) {
                    sum -= arr[windowStart];
                    windowStart++;
                    if (sum > x) {
                        len = windowEnd - windowStart + 1;
                        minLen = Math.min(len, minLen);
                    }
                }
            }
            windowEnd++;
        }
        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
