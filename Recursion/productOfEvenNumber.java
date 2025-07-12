package Recursion;

public class productOfEvenNumber {
    public static void main(String[] args) {
        int[] nums = {-8, -3, 2};
        System.out.println(productEvenList(nums));
    }
//      Wrapper function
    static int productEvenList(int[] ar) {
        return productEven(0, ar);
    }

    static int productEven(int a, int[] arr) {
        if (a == arr.length) return 1;
        if (arr[a] % 2 == 0) return productEven(a + 1, arr) * arr[a];
        return productEven(a + 1, arr) * 1;
    }
}
