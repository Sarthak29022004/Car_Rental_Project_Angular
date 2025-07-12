package ArraysJava;

import java.util.ArrayList;

public class Merge_Two_2D_Arrays_by_Summing_Values_LeetCode {
    public static void main(String[] args) {
        int[][] num1 = {
                {2, 4},
                {3, 6},
                {5, 5}
        };
        int[][] num2 = {
                {1, 3},
                {4, 3}
        };
        int[][] a = mergeArrays(num1, num2);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i][0] + " ");
            System.out.println(a[i][1]);
        }
    }

    static int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i = 0;
        int j = 0;
        ArrayList<int[]> arr = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            int[] ko = new int[2];
            if (nums1[i][0] == nums2[j][0]) {
                ko[0] = nums1[i][0];
                ko[1] = nums1[i][1] + nums2[j][1];
                i++;
                j++;
            } else if (nums1[i][0] < nums2[j][0]) {
                ko[0] = nums1[i][0];
                ko[1] = nums1[i][1];
                i++;
            } else {
                ko[0] = nums2[j][0];
                ko[1] = nums2[j][1];
                j++;
            }
            arr.add(ko);
        }

        while (i < nums1.length) {
            arr.add(nums1[i++]);
        }
        while (j < nums2.length) {
            arr.add(nums2[j++]);
        }

        return arr.toArray(int[][]::new);
    }
}


//public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
//        int m = nums1.length, n = nums2.length;
//        int i = 0, j = 0;
//        List<int[]> result = new ArrayList<>();
//
//        while(i < m && j < n){
//            if(nums1[i][0] == nums2[j][0]){
//                result.add(new int[]{nums1[i][0], nums1[i][1] + nums2[j][1]});
//                i++; j++;
//            }
//            else if(nums1[i][0] < nums2[j][0]){
//                result.add(nums1[i]);
//                i++;
//            }
//            else{
//                result.add(nums2[j]);
//                j++;
//            }
//        }
//        while(i < m){
//            result.add(nums1[i]);
//            i++;
//        }
//        while(j < n){
//            result.add(nums2[j]);
//            j++;
//        }
//        return result.toArray(new int[result.size()][]);
//    }