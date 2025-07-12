package ArraysJava;

public class Maximum_Candies_Allocated_to_K_Children_LeetCode {
    public static void main(String[] args) {
        int[] arr = {2,5};
        System.out.println(maximumCandies(arr, 11));
    }

    static int maximumCandies(int[] candies, long k) {
        int min = candies[0];
        int canSum = 0;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            if (candies[i] < min) {
                min = candies[i];
            }
            canSum += candies[i];
        }
        if (canSum < k) {
            return 0;
        }
        int ans = canSum / (int) k;
        if (ans < min) {
            return ans;
        }
        return min;
    }
}
