package ArraysJava;

public class second_largest_element {
    public static void main(String[] args) {
        int[] arr = {4, 7, 34, 65, 35, 7, 87, 87, 45, 76, 75};
        System.out.println(SecLarge(arr));
        int max1 = 0;
        int max2 = 0;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] == max1) {         //See the Logic
                max1 = arr[i];
            } else if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            } else if (arr[i] > max2) {
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }

    static int SecLarge(int[] arr) {
        int max1 = 0, max2 = 0;
        if (arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }
        for (int i : arr) {
            if (i == max1) {
                max1 = i;
            } else if (i > max1) {
                max2 = max1;
                max1 = i;
            } else if (i > max2) {
                max2 = i;
            }
        }
        return max2;
    }
}
