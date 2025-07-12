package Strings_And_StringBuilder;

public class Reverse_Prefix_of_Word_LeetCode {

    public static void main(String[] args) {
        Reverse_Prefix_of_Word_LeetCode obj = new Reverse_Prefix_of_Word_LeetCode();
        System.out.println();
        System.out.println();
        System.out.println(obj.reversePrefix("abcdefd", 'd'));
    }

    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        if (ind == -1) {
            return word;
        }
        StringBuilder str = new StringBuilder();
        for (int i = ind; i > -1; i--) {
            str.append(word.charAt(i));
        }
        for (int i = ind + 1; i < word.length(); i++) {
            str.append(word.charAt(i));
        }
        return str.toString();
    }
}
