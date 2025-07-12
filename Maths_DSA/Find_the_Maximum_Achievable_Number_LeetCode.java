package Maths_DSA;

public class Find_the_Maximum_Achievable_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(theMaximumAchievableX(4, 1));
    }

    static int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
}

//Given two integers, num and t. A number x is achievable if it can become equal to num after applying the following operation at most t times:
//
//Increase or decrease x by 1, and simultaneously increase or decrease num by 1.
//Return the maximum possible value of x.
//
//
//
//Example 1:
//
//Input: num = 4, t = 1
//
//Output: 6
//
//Explanation:
//
//Apply the following operation once to make the maximum achievable number equal to num:
//
//Decrease the maximum achievable number by 1, and increase num by 1.