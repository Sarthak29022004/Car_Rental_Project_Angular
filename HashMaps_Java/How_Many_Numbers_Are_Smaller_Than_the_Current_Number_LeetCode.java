package HashMaps_Java;


import java.util.Arrays;

public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_LeetCode {
    public static void main(String[] args) {
        int[] arr = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
    }

    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            int store = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) store++;
            }
            ans[index] = store;
            index++;
        }
        return ans;
    }
}
