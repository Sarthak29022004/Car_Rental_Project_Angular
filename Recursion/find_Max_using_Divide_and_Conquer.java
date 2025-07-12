package Recursion;

public class find_Max_using_Divide_and_Conquer {
    public static void main(String[] args) {
        int[] array = {4, 6, 3, -6, 9, 0, 2, 5};
        System.out.println(findMaxElement(array));
    }

    static int findMaxElement(int[] arr) {
        if (arr.length == 0) return 0;
        return findMax(0, arr.length - 1, arr);
    }

    static int findMax(int i, int j, int[] arr) {
        if (arr[i] == arr[j]) return arr[i];
        int mid = (i + j) / 2;
        return Math.max((findMax(i, mid, arr)), findMax(mid + 1, j, arr));
    }
}
