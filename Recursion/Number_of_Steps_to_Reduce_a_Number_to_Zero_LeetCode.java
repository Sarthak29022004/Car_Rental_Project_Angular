package Recursion;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero_LeetCode {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
    }

    static int numberOfSteps(int num) {
        if (num <= 0) return 0;
        if (num % 2 == 0) return numberOfSteps((num / 2)) + 1;
        return numberOfSteps(num - 1) + 1;
    }
}
