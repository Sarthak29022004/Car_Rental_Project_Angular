package Maths_DSA;

public class Check_if_Number_is_a_Sum_of_Powers_of_Three_LeetCode {
    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(91));
    }

    static boolean checkPowersOfThree(int n) {
        while (n > 0) {
            if (n % 3 == 2) {
                return false;
            }
            n /= 3;
        }
        return true;
    }
}
