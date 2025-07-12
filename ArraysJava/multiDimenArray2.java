package ArraysJava;

import java.util.Arrays;

public class multiDimenArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[5][4];
        int row = 0;
        while (row < arr.length) {
            int col = 0;
            while (col < arr[row].length) {
                arr[row][col] = (int) (Math.random() * 100);
                col++;
            }
            row++;
        }

        for (int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

        int max = 0;
        for (int[] a : arr){           //very important
            for (int b :a){
                if (b>max){
                    max=b;
                }
            }
        }
        System.out.println(max);
    }
}
