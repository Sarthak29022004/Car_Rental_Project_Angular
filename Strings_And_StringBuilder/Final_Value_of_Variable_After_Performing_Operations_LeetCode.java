package Strings_And_StringBuilder;

import java.util.Objects;

public class Final_Value_of_Variable_After_Performing_Operations_LeetCode {
    public static void main(String[] args) {
        String[] arr = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(arr));
    }

    static int finalValueAfterOperations(String[] operations) {
        int ans = 0;
        for (String str : operations) {
            if ((str.equals("X++")) || (str.equals("++X"))) {
                ans += 1;
            } else {
                ans -= 1;
            }
        }
        return ans;
    }
}
