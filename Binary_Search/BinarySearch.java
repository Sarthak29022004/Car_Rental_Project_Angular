package Binary_Search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -15, -7, 0, 2, 4, 7, 9, 14, 19, 22, 34, 56, 79, 84, 100};
        System.out.println(bSearch(arr, 100));
    }

    static int bSearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

//if (nums[start] == target) {
//  return start;
// } else if (nums[end] == target) {
// return end;
// }
