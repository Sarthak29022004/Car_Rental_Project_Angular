package Maths_DSA;

public class fingUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 4, 6, 3};
        System.out.println(ans(arr));
    }

    static int ans(int[] nums) {
        int unique = 0;
        for (int i : nums) {
            unique ^= i;
        }
        return unique;
    }
}
