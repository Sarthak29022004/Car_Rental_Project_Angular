package ArraysJava;

import java.util.ArrayList;
import java.util.HashMap;

public class Number_of_Sub_arrays_With_Odd_Sum_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,4,6};
        System.out.println(numOfSubarrays(arr));
    }

    static int numOfSubarrays(int[] arr) {
        long oddCount = 0, prefixSum = 0;
        for (int a : arr) {
            prefixSum += a;
            oddCount += prefixSum % 2;
        }
        oddCount += (arr.length - oddCount) * oddCount;
        return (int)(oddCount % 1_000_000_007);
    }
}


//static int numOfSubarrays(int[] arr) {
//        int oddSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int subArray = 0;
//            for (int j = i; j < arr.length; j++) {
//                subArray += arr[j];
//                if (subArray % 2 != 0) {
//                    oddSum++;
//                }
//            }
//        }
//        return oddSum;
//    }


//ArrayList<Integer> arrayList = new ArrayList<>();
//        int oddSum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            int subArray = 0;
//            for (int j = i; j < arr.length; j++) {
//                subArray += arr[j];
//                arrayList.add(subArray);
//            }
//        }
//        for (int i = 0; i < arrayList.size(); i++) {
//            if (arrayList.get(i) % 2 != 0) {
//                oddSum++;
//            }
//        }
//        return oddSum;