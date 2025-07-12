package ArraysJava2;

public class Solving_Questions_With_Brainpower_LeetCode {
    public static void main(String[] args) {
        int[][] arr = {  //21,5],[92,3],[74,2],[39,4],[58,2],[5,5],[49,4],[65,3
                {21,5},
                {92,3},
                {74,2},
                {39,4},
                {58,2},
                {5,5},
                {49,4},
                {65,3}
        };
        System.out.println(mostPoints(arr));
    }

    static long mostPoints(int[][] questions) {
        long[] ans = new long[questions.length];
        for (int i = questions.length - 1; i >= 0; i--) {
            int index = i + questions[i][1] + 1;
            if (index < questions.length) {
                ans[i] = ans[index] + questions[i][0];
            } else {
                ans[i] = questions[i][0];
            }
            if (i < questions.length - 1) {
                ans[i] = Math.max(ans[i + 1], ans[i]);
            }
        }
        return ans[0];
    }
}
//        int max = 0;
//        for (int i = 0; i < n; i = i + 3) {
//            max = max + questions[i][0];
//        }
//        int max1 = 0;
//        for (int i = 1; i < n; i = i + 3) {
//            max1 = max1 + questions[i][0];
//        }
//        int max2 = 0;
//        for (int i = 2; i < n; i = i + 3) {
//            max2 = max2 + questions[i][0];
//        }
//        int ans = Math.max(max,Math.max(max1,max2));