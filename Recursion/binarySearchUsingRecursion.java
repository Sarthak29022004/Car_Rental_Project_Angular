package Recursion;

public class binarySearchUsingRecursion {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 7, 10, 15, 24, 36, 48, 57, 69, 78, 100};
        System.out.println(search(nums, 10, 0, nums.length - 1));  //4
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) return -1;
        int m = s + (e - s) / 2;
        if (arr[m] == target) return m;
        if (target < arr[m]) return search(arr, target, s, m - 1);
        return search(arr, target, m + 1, e);
    }
}
