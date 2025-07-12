package Binary_Search;

public class floor_of_no {
    public static void main(String[] args) {
        int[] arr = {-18, -15, -7, 0, 2, 4, 7, 9, 14, 19, 22, 34, 56, 79, 84, 100};
        System.out.println(ceiling(arr, 20));   //19
    }

    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return arr[end];   //use end for floor
            }
        }
        return arr[end];          //use end for floor
    }
}
