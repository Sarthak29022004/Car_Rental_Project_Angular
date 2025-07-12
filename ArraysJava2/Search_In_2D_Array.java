package ArraysJava2;

import java.util.Arrays;

public class Search_In_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {26, 34, 11, 87},
                {15, 40},
                {27, 84, 9, 75}
        };
        int target = 84;
        int[] ans = min(arr, target);
        System.out.println(Arrays.toString(ans));   //[2, 1]
        System.out.println(min(arr, target));  //[I@7b23ec81
        System.out.println(Arrays.toString(min(arr, target)));  //[2, 1]
    }

    static int[] min(int[][] ar, int target) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] == target) {
                    return new int[]{i, j};           //New Concept
                }
            }
        }
        return new int[]{-1, -1};
    }
}

//for(int[] i :ar){
// for(int j :i){
//if(j ==target){
//return
//    }
//  }
//}