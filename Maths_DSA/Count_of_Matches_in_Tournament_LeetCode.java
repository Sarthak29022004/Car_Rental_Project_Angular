package Maths_DSA;

public class Count_of_Matches_in_Tournament_LeetCode {
    public static void main(String[] args) {
        System.out.println(numberOfMatches(14));
    }

    static int numberOfMatches(int n) {
        int matches = 0;
        while (n > 1) {
            if (n % 2 == 0) {
                matches += n / 2;
                n = n / 2;
            } else {
                matches += (n - 1) / 2 + 1;
                n = (n - 1) / 2;
            }
        }
        return matches;
    }
}
