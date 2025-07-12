package Maths_DSA;

public class Check_if_Two_Chessboard_Squares_Have_the_Same_Color_LeetCode {
    public static void main(String[] args) {
        System.out.println(checkTwoChessboards("c2","g4"));
    }

    static boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int sum1 = coordinate1.charAt(0) + coordinate1.charAt(1);
        int sum2 = coordinate2.charAt(0) + coordinate2.charAt(1);
        if (sum1 % 2 == 0 && sum2 % 2 == 0){
            return true;
        } else if (sum1 % 2 != 0 && sum2 % 2 != 0) {
            return true;
        }
        return false;
    }
}
