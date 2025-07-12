package Recursion;

public class sumOfOddsInList {
    public static void main(String[] args) {
        int[] a = {2, 3, -4, 5, 11, 6, 7};
        System.out.println(sumOddsInList(a));
    }
//  this function used to avoid callers to specify index (Wrapper function)
    static int sumOddsInList(int[] nums) {
        return sumOdds(0, nums);
    }
//  recursion function
    static int sumOdds(int i, int[] arr) {
        if (i == arr.length) return 0;
        if (arr[i] % 2 != 0) return sumOdds(i + 1, arr) + arr[i];
        return sumOdds(i + 1, arr) + 0;
    }
}


//        int val = 0;
//        if (arr[i] % 2 != 0)
//            val = arr[i];
//        return sumOdds(i + 1, arr) + val;