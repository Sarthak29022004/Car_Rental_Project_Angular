package ArraysJava;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 46, 86, 2, 74, 90};

        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));  //[90, 74, 2, 86, 46, 4, 3]
    }
}
