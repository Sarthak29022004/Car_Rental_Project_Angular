package Recursion;

public class find_Min_Value_Using_Divide_and_Conquer {
    public static void main(String[] args) {
        int[] array = {2, 9, 3, 4, 2, 0, 8, 3, 5};
        System.out.println(findMinElement(array));
    }

    static int findMinElement(int[] arr) {
        if (arr.length == 0) return 0;
        return findMin(0, arr.length - 1, arr);
    }

    static int findMin(int i, int j, int[] arr) {
        if (arr[i] == arr[j]) return arr[i];
        if (j - i == 1) return Math.min(arr[i], arr[i + 1]);
        if (j - i == 2) return Math.min(arr[i], Math.min(arr[i + 1], arr[i + 2]));

        int mid = (j - i) / 3;
        int mid1 = i + mid;
        int mid2 = i + 2 * mid;

        int min1 = findMin(i, mid1, arr);
        int min2 = findMin(mid1 + 1, mid2, arr);
        int min3 = findMin(mid2 + 1, j, arr);

        int min = Math.min(min1, Math.min(min2, min3));
        
        return min;
    }
}
