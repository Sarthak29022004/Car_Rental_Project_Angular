package Maths_DSA;

public class Check_if_Number_is_a_Sum_of_Powers_of_Four_LeetCode {
    public static void main(String[] args) {
        System.out.println(checkPowersOfFour(18));
    }

    static boolean checkPowersOfFour(int n) {
        while (n > 0) {
            if (n % 4 != 1) return false;
            n /= 4;
        }
        return true;
    }
}
