package HashMaps_Java;

public class Count_Number_of_Pairs_With_Absolute_Difference_K_LeetCode {
    public static void main(String[] args) {
        int[] arr ={3,2,1,5,4};
        System.out.println(countKDifference(arr,2));
    }

    static int countKDifference(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == k){
                    count++;
                }
            }
        }
        return count;
    }
}
