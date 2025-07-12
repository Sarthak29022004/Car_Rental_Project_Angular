package Sliding_Window;

public class Number_of_Substrings_Containing_All_Three_Characters_LeetCode {
    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }

    static int numberOfSubstrings(String s) {
        char[] ch = s.toCharArray();
        int[] abc = new int[3];
        for (int i = 0; i < abc.length; i++) {
            abc[i] = -1;
        }
        int count = 0, right = 0;
        while (right < ch.length) {
            abc[ch[right] - 'a'] = right;
            int minIndex = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                minIndex = Math.min(minIndex, abc[i]);
            }
            count += (minIndex + 1);
            right++;
        }
        return count;
    }
}
