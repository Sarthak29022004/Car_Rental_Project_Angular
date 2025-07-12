package ArraysJava;

public class Search_in_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {
                {18, 9, 12},
                {36, -9, 91},
                {44, 33, 16}
        };
        int max = arr[0][0];
        for (int[] row : arr) {
            for (int col : row) {
                if (col > max) {
                    max = col;
                }
            }
        }
        System.out.println(max);
    }
}
