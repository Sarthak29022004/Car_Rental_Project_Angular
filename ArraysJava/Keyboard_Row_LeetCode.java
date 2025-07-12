package ArraysJava;

import java.util.ArrayList;

public class Keyboard_Row_LeetCode {
    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(findWords(words));
    }

    static String[] findWords(String[] words) {
        String[][] strings = {
                {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p"},
                {"a", "s", "d", "f", "g", "h", "j", "k", "l"},
                {"z", "x", "c", "v", "b", "n", "m"}
        };
        ArrayList<String> ans = new ArrayList<>();
        for (String s: words){
            int t = 0;
            for (char ch:s.toCharArray()){

            }
        }
        return ans.toArray(new String[0]);
    }
}
