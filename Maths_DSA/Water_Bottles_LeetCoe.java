package Maths_DSA;

public class Water_Bottles_LeetCoe {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(10, 3));
    }//10   4   1

    static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int modEmpty = numBottles % numExchange;
            numBottles = (numBottles - modEmpty) / numExchange;
            ans += numBottles;
            numBottles = numBottles + modEmpty;
        }
        return ans;
    }
}