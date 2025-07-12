package ArraysJava;

import java.util.Arrays;
import java.util.Scanner;

public class declare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];  //0-4 = 5
        arr[0] = 2;
        arr[1] = 1;
        arr[2] = 9;
        arr[3] = 4;
        arr[4] = 7;
        System.out.println(Arrays.toString(arr));   //[2, 1, 9, 4, 7]
//==============================================================================
        int[] arr2 = {5, 10, 15, 20, 25};
        System.out.println(arr2);            //[I@65b3120a
//==============================================================================
        int[] arr10 = new int[10];
        for (int i = 0; i < arr10.length; i++) {
            arr10[i] = (int) (Math.random() * 10);
        }
        int c = 0;
        while (c < 10) {
            System.out.print(arr10[c] + " ");
            c++;
        }
//==============================================================================
        System.out.println();

        int[] arr3 = new int[3];
        for (int i = 0; i < arr3.length; i++) {
            System.out.print("Enter " + (i + 1) + " no : ");
            arr3[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr3));
//==============================================================================
        String[] name = new String[3];
        name[0] = "Sarthak";
        name[1] = "Nagesh";
        name[2] = "Akshay";
    }
}
