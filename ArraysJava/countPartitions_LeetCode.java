package ArraysJava;

public class countPartitions_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8};
        System.out.println(countPartitions(arr));
    }

    static int countPartitions(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int maxL = 0;
            int maxR = 0;
            for (int l = 0; l <= i; l++) {
                maxL = maxL + nums[l];
            }
            for (int r = i + 1; r < nums.length; r++) {
                maxR = maxR + nums[r];
            }
            if ((maxL - maxR) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
