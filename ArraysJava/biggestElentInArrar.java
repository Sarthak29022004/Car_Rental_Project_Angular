package ArraysJava;

public class biggestElentInArrar {
    public static void main(String[] args) {

        int[] num = {34, 65, 94, 84};

        int max = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println(max);

        int big = num[0];
        for (int i : num) {          //use this one
            if (i > big) {
                big = i;
            }
        }
        System.out.println(big);
    }
}
