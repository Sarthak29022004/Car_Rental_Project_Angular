package ArraysJava;

public class Largest_Number_At_Least_Twice_of_Others_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(dominantIndex(arr));
    }

    static int dominantIndex(int[] nums) {
        int index = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i != index && nums[i] * 2 > max) return -1;
        }
        return index;
    }
}
