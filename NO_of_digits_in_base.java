public class NO_of_digits_in_base {
    public static void main(String[] args) {
        int n = 101;
        int b = 2;
        int ans = (int) (Math.log(n) / Math.log(b)) + 1;
        System.out.println(ans);
    }
}
//formula = log n base b + 1