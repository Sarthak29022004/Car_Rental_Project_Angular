package ArraysJava;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three_LeetCode {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(minimumOperations(arr));
    }

    static int minimumOperations(int[] nums) {
        int ans = nums.length;
        for (int num : nums) {
            if (num % 3 == 0) ans--;
        }
        return ans;
    }
}
