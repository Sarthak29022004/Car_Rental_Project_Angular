package ArraysJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class forEachLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        int c = 0;
        while (c < arr.length) {
            arr[c] = (int) (Math.random() * 100);
            c++;
        }
//=================  print using enhanced for loop===================
        for (int i : arr) {
            System.out.print(i + " "); //here i represents the element of array  //52 82 23 76 32
        }
//=====================================================================================
        System.out.println();

        String[] name = new String[3];
        int count = 0;
        while (count < name.length) {
            name[count] = in.next();
            count++;
        }
        for (String n : name) {
            System.out.print(n + " ");
        }
    }
}
