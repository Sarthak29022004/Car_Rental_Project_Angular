package Binary_Search;

import java.util.ArrayList;
import java.util.List;

public class First_and_last_element {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10,11};
        System.out.println(firstAndLast(nums, 8));
        System.out.println(firstAndLast2(nums, 8));
    }

    static List<Integer> firstAndLast(int[] nums, int target) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                list1.add(i);
            }
            if (nums[i] > target){
                break;
            }
        }
        return list1;
    }

    static int firstAndLast2(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}

