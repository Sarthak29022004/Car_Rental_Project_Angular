package Strings_And_StringBuilder;

import java.util.ArrayList;
import java.util.Arrays;

public class Keyboard_Row_LeetCode {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        String line1 = "qwertyuiopQWERTYUIOP";
        String line2 = "asdfghjklASDFGHJKL";
        String line3 = "zxcvbnmZXCVBNM";
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        for (String str : words) {
            for (char ch : str.toCharArray()) {
                if (line1.indexOf(ch) != -1) {
                    flag1 = true;
                } else if (line2.indexOf(ch) != -1) {
                    flag2 = true;
                } else if (line3.indexOf(ch) != -1) {
                    flag3 = true;
                }
            }
            if (flag1 && !flag2 && !flag3) list.add(str);
            else if (flag2 && !flag1 && !flag3) list.add(str);
            else if (flag3 && !flag2 && !flag1) list.add(str);
            flag1 = flag2 = flag3 = false;
        }
        return list.toArray(new String[0]);
    }
}
