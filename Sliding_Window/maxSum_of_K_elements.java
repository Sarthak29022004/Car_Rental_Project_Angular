package Sliding_Window;

public class maxSum_of_K_elements {
    public static void main(String[] args) {
        int[] arr = {4, 7, 0, 4, 6, 73, 45, 4, 3, 5, 34, 56, 76, 23, 57, 35};
        System.out.println(maxSum(arr, 4));
    }

    static int maxSum(int[] nums, int k) {
        int len = nums.length;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        int currSum = maxSum;
        int i = 0;
        while (i < len - k) {
            int preNum = nums[i];
            int nextNum = nums[i + k];
            currSum = (currSum - preNum) + nextNum;
            if (currSum > maxSum) {
                maxSum = currSum;
            }
            i++;
        }
        return maxSum;
    }
}
