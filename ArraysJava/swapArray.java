package ArraysJava;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 46, 86, 2, 74};
        swap(arr,3,5);
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        System.out.println(Arrays.toString(arr));       //[3, 4, 46, 74, 2, 86]
    }
}
