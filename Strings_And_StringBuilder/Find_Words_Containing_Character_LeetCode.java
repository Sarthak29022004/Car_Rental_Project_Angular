package Strings_And_StringBuilder;

import java.util.ArrayList;
import java.util.List;

public class Find_Words_Containing_Character_LeetCode {
    public static void main(String[] args) {
        String[] arr = {"abc", "bcd", "aaaa", "cbc"};
        System.out.println(findWordsContaining(arr, 'a'));
    }

    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        String str = Character.toString(x);
        for (int i = 0; i < words.length; i++) {
            if (words[i].contains(str)) {  // words[i].indexOf(str) != -1
                list.add(i);               // resultIndices.add(i);
            }
        }
        return list;
    }
}
