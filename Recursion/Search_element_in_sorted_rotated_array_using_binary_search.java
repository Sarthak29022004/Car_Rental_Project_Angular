package Recursion;

public class Search_element_in_sorted_rotated_array_using_binary_search {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 1, 0, arr.length));
    }

    static int search(int[] nums, int target, int s, int e) {
        if (s > e) return -1;
        int mid = s + (e - s) / 2;
        if (nums[mid] == target) return mid;
        if (nums[s] <= nums[mid]) {
            if (target >= nums[s] && target <= nums[mid]) {
                return search(nums, target, s, mid - 1);
            } else {
                return search(nums, target, mid + 1, e);
            }
        }
        if (target >= nums[mid] && target <= nums[e]) {
            return search(nums, target, mid + 1, e);
        }
        return search(nums, target, s, mid - 1);
    }
}
