package ArraysJava;

public class Maximum_Value_of_an_Ordered_Triplet_I_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1000000,1,1000000};
        System.out.println(maximumTripletValue(arr));
        System.out.println(maximumTripletVal(arr));
    }

    static long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long ans = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    long val = (long) (nums[i] - nums[j]) * nums[k];
                    if (val > ans) {
                        ans = val;
                    }
                }
            }
        }
        return ans;
    }

    static long maximumTripletVal(int[] nums) {
        int n = nums.length;
        long res = 0;
        int imax = 0, dmax = 0;
        for (int num: nums) {
            res = Math.max(res, (long) dmax * num);
            dmax = Math.max(dmax, imax - num);
            imax = Math.max(imax, num);
        }
        return res;
    }
}
