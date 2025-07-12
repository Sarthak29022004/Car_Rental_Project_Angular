//3423. Maximum Difference Between Adjacent Elements in a Circular Array
//Given a circular array nums, find the maximum absolute difference between adjacent elements.
//
//Note: In a circular array, the first and last elements are adjacent.
//
//
//
//Example 1:
//
//Input: nums = [1,2,4]
//
//Output: 3

package ArraysJava;

public class maxAdjacentDistance_LeetCode {
    public static void main(String[] args) {
        int[] arr={-3,-4,2};
        System.out.println(maxAdjacentDistance(arr));
    }
    static int maxAdjacentDistance(int[] nums) {
        int n= nums.length-1;
        int max=Math.abs(nums[n]-nums[0]);
        for (int i=1;i< nums.length;i++){
            if(Math.abs(nums[i-1]-nums[i])>max){
                max=Math.abs(nums[i-1]-nums[i]);
            }
        }
        return max;
    }
}
