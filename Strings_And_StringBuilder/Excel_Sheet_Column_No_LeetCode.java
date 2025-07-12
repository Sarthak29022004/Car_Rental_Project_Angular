package Strings_And_StringBuilder;

public class Excel_Sheet_Column_No_LeetCode {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    static int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int toNumber = columnTitle.charAt(n-1) - 64;
        int val = 26;
        for (int i = n - 2; i > -1; i--) {
            int ch = columnTitle.charAt(i);
            int no = ch - 64;
            toNumber += no * val;
            val = val * 26;
        }
        return toNumber;
    }
}
// AA   ->   26*1+1