package Binary_Search;

public class Order_Agnostic_BNS {
    public static void main(String[] args) {
        int[] arr = {-18, -15, -7, 0, 2, 4, 7, 9, 14, 19, 22, 34, 56, 79, 84, 100};
        int[] arr2 = {100, 74, 56, 45, 30, 15, 7, 1, -2, -6, -16};
        System.out.println(bSearch(arr, 84));
        System.out.println(bSearch(arr2, 56));
    }

    static int bSearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        boolean isAscending = nums[start] < nums[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (isAscending) {
                if (target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
