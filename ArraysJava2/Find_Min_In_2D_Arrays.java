package ArraysJava2;

public class Find_Min_In_2D_Arrays {
    public static void main(String[] args) {
        int[][] arr = {
                {26, 34, 11, 87},
                {15, 40},
                {27, 84, 9, 75}
        };
        System.out.println(min(arr));
    }

    static int min(int[][] ar) {
        int mini = ar[0][0];
        for (int[] i : ar) {
            for (int j : i) {
                if (j < mini) {
                    mini = j;
                }
            }
        }
        return mini;
    }
}
