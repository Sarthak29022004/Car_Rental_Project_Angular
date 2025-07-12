package HashMaps_Java;

import java.util.HashMap;

public class Excel_Sheet_Column_Number_LeetCode {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AB"));
    }

    static int titleToNumber(String columnTitle) {
        int n = columnTitle.length() - 1;
        int ans = 0;
        int multiply = 1;
        while (n > -1) {
            char ch = (columnTitle.charAt(n));
            int num = ch - 64;
            ans += multiply * num;
            multiply *= 26;
            n--;
        }
        return ans;
    }
}

// A  = 1
// AB = 2 + 1 * 26 = 28
// ZY = 25 + 26 * 26 = 701
// AAA = 1 ,1 * 26,+ 26 * 26 =    1 + 26 + 676 = 703
// ZZ = 702   =  26 + 26 * 26 = 702
// ZZZ = 26 + 26 * 26 + 26 * 26 * 26 =
// * 1 26 26*26