package ArraysJava;

import java.util.Arrays;
import java.util.Scanner;

public class multiDimenArray {
    public static void main(String[] args) {

        int[][] arr2D = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9},
        };
        System.out.println(Arrays.toString(arr2D));    //[[I@7b23ec81, [I@6acbcfc0, [I@5f184fc6]

        int[][] arr2D2 = new int[3][2]; //Row is mandatory  but column is not mandatory

        for (int i = 0; i < arr2D.length; i++) {
            System.out.println(Arrays.toString(arr2D[i]));
        }

        arrOutput(arr2D);
        arrInput(arr2D2);
    }

    static void arrOutput(int[][] arr2D) {

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print((arr2D[row][col]) + " ");
            }
            System.out.println();
        }
    }

    static void arrInput(int[][] arr) {
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print("Enter " + (row+1) + " row " + (col+1) + " column element : ");
                arr[row][col] = in.nextInt();
            }
        }
    }
}
