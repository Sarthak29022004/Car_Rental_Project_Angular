package Strings_And_StringBuilder;

public class Find_the_Original_Typed_String_I_LeetCode {
    public static void main(String[] args) {
        System.out.println(possibleStringCount("abbcccc"));
    }

    public static int possibleStringCount(String word) {
        int n = word.length();
        int val = 1;
        for (int i = 0; i < n - 1; i++) {
            if (word.charAt(i) == word.charAt(i + 1)) {
                val = val + 1;
            }
        }
        return val;
    }
}
