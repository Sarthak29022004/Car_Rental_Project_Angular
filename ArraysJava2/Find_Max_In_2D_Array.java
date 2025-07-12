package ArraysJava2;

import java.util.Arrays;

public class Find_Max_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {26, 34, 11, 87},
                {15, 40},
                {27, 84, 9, 75}
        };
        System.out.println(min(arr));
        Arrays.sort(arr);
        for (int[] arrr : arr){
            System.out.println(Arrays.toString(arrr));
        }
    }

    static int min(int[][] ar) {
        int max = Integer.MIN_VALUE;
        for (int[] i : ar) {
            for (int j : i) {
                if (j > max) {
                    max = j;
                }
            }
        }
        return max;
    }
}
