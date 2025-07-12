package Maths_DSA;

import java.util.Arrays;

public class Maximum69Number_LeetCode {

    public static void main(String[] args) {
        System.out.println(maximum69Number(9996));
    }

    public static int maximum69Number(int num) {
        String str = Integer.toString(num);
        int ans = str.parseInt(str.replaceFirst("6","9"));
        return ans;
    }
}

//String str = Integer.toString(num);
        // int i = str.indexOf('6');
        // if (i == -1) {
        //     return num;
        // }
        // char[] arr = str.toCharArray();
        // arr[i] = '9';
        // String S = new String(arr);
        // int ans = Integer.parseInt(S);
        // return ans;

//        int num1 = num;
// int newNum = 0;
// int index = -1;
// int ind = 0;
// while (num1 != 0) {
//     if (num1 % 10 == 6) {
//         index = ind;
//     }
//     newNum = newNum * 10 + num1 % 10;
//     ind++;
//     num1 = num1 / 10;
// }
// int newNum2 = 0;
// int in = 0;
// while (newNum != 0) {
//     if (in == index) {
//         newNum2 = newNum2 * 10 + 9;
//     } else {
//         newNum2 = newNum2 * 10 + newNum % 10;
//     }
//     newNum = newNum / 10;
//     in++;
// }
        // return newNum2;
