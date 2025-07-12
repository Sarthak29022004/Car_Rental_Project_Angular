package ArraysJava2;

public class Find_Min {
    public static void main(String[] args) {
        int[] arr = {16, 9, 46, 45, 73, 7, 3, 8, 26};
        System.out.println(min(arr));
    }

    static int min(int[] ar) {
        int mini = ar[0];
        for (int i : ar) {
            if (i < mini) {
                mini = i;
            }
        }
        return mini;
    }
}
