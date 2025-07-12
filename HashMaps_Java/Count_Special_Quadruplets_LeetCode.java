package HashMaps_Java;

public class Count_Special_Quadruplets_LeetCode {
    public static void main(String[] args) {
        int[] arr = {9,6,8,23,39,23};
        System.out.println(countQuadruplets(arr));
    }

    static int countQuadruplets(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                for (int k = j + 1; k < nums.length - 1; k++) {
                    for (int l = k+1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) {
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
//if (nums[i] + nums[j] + nums[k] == nums[k + 1]) {
//                        count++;
//                    }