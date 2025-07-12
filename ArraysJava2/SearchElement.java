package ArraysJava2;

public class SearchElement {
    public static void main(String[] args) {
        int target = 14;
        int[] arr = {7, 14, 21, 28, 6, 12, 18};
        int ans = sortArray(arr, target);
        System.out.println(ans);
    }

    static int sortArray(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}