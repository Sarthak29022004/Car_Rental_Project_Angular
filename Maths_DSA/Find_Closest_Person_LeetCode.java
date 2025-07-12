package Maths_DSA;

public class Find_Closest_Person_LeetCode {
    public static void main(String[] args) {
        System.out.println(findClosest(10, 1, 12));
    }

    public static int findClosest(int x, int y, int z) {
        int num1 = Math.abs(z - x);
        int num2 = Math.abs(y - z);
        if (num1 < num2) {
            return 1;
        } else if (num2 < num1) {
            return 2;
        }
        return 0;
    }
}
