package ArraysJava;

public class smallestEleInArray {
    public static void main(String[] args) {

        int[] num = {34, 65, 94, 84, 20, 44};

        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }
        System.out.println(min);

        int small = num[0];         //use this one
        for (int i : num) {
//            small = i;
            if (i < small) {
                small = i;
            }
        }
        System.out.println(small);
    }
}
