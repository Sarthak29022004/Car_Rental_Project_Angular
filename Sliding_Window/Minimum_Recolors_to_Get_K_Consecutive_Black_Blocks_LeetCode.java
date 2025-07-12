package Sliding_Window;

public class Minimum_Recolors_to_Get_K_Consecutive_Black_Blocks_LeetCode {
    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBWBWBW", 2));
    }

    static int minimumRecolors(String blocks, int k) {
        int op = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                op++;
            }
        }
        int ans = op;
        for (int i = 1; i <= blocks.length() - k; i++) {
            if (blocks.charAt(i - 1) == 'W') {
                op--;
            }
            if (blocks.charAt(i + k - 1) == 'W') {
                op++;
            }
            ans = Math.min(ans, op);
        }
        return ans;
    }
//    static int minimumRecolors(String blocks, int k) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i <= blocks.length() - k; i++) {
//            int count = 0;
//            for (int j = i; j < i + k; j++) {
//                if (blocks.charAt(j) == 'W') {
//                    count++;
//                }
//            }
//            if (count==0){
//                return 0;
//            }
//            list.add(count);
//        }
//        int ans = list.get(0);
//        for (int num : list) {
//            if (num < ans) {
//                ans = num;
//            }
//        }
//        return ans;
//    }
}
