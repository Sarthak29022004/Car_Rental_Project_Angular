package ArraysJava;

import java.util.Arrays;

public class changeArray {
    public static void main(String[] args) {

        int[] num = {34, 65, 94, 84};
        System.out.println(Arrays.toString(num));     //[34, 65, 94, 84]
        change(num);
        System.out.println(Arrays.toString(num));     //[99, 65, 94, 84]

    }
    static void change(int[] arr){
        arr[0]= 99;
    }
}
