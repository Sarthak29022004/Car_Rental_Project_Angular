package Bubble_Sort;

import java.util.Arrays;

public class Bubble_Sort1 {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 9, 6, 10, 11, 2, 1};
        //int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};

        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {  //(swapped==false)
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
