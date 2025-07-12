public class Total_sum {
    public static void main(String[] args) {
        System.out.println(ts(999));
    }

    static int ts(int n) {
        if (n == 0) return 0;
        int ans = n % 9;
        return ans == 0 ? 9 : ans;
//        return (n % 9 == 0) ? 9 : n % 9;
    }
}