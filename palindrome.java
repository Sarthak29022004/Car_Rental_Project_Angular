public class palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        int a=(int)(Math.log10(121)-1);
        System.out.println(a);
    }
    static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int y = x;
            int ans = 0;
            while (y > 0) {
                int rem = y % 10;
                y = y / 10;
                ans = ans * 10 + rem;
            }
            if (ans == y) {
                return true;
            }
        }
        return false;
    }
}
