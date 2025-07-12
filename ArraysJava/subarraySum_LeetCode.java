//You are given an integer array nums of size n. For each index i where 0 <= i < n, define a
//subarray
//nums[start ... i] where start = max(0, i - nums[i]).
//
//        Return the total sum of all elements from the subarray defined for each index in the array.
//
//
//
//        Example 1:
//
//Input: nums = [2,3,1]
//
//Output: 11
package ArraysJava;

public class subarraySum_LeetCode {
    public static void main(String[] args) {
        int[] nums={3,1,1,2};
        System.out.println(subarraySum(nums));
    }
    static int subarraySum(int[] nums) {
        int max=0;
        for(int i=0; i<nums.length;i++){
            int start = Math.max(0, i - nums[i]);
            for(int j=start;j<= i;j++){         //end is i
                max=max+nums[j];
            }
        }
        return max;
    }
}
